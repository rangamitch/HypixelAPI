package Guild;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guild {
    private String name;
    private String id;

    private int coins;
    private int coinsEver;
    private Long created;

    private List<Member> members;
    private List<Rank> ranks;

    public Guild(String identifier, boolean isId, String apiKey){
        JSONObject json;
        String url = "https://api.hypixel.net/guild?key=" + apiKey + (isId ? "&id=" : "&name=") + identifier;
        try{
            json = ((JSONObject) new JSONParser().parse(jsonGetRequest(url).get("guild").toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        this.name = json.get("name").toString();
        this.id = json.get("_id").toString();

        this.coins = Integer.parseInt(json.get("coins").toString());
        this.coinsEver = Integer.parseInt(json.get("coinsEver").toString());
        this.created = Long.parseLong(json.get("created").toString());

        try {
            this.members = gMembers(((JSONArray) new JSONParser().parse(json.get("members").toString())));
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        try {
            this.ranks = gRank(((JSONArray) new JSONParser().parse(json.get("ranks").toString())));
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }


    }

    private List<Member> gMembers(JSONArray json){
        List<Member> list = new ArrayList<>();
        for(Object o : json){
            try {
                JSONObject memJson = ((JSONObject) new JSONParser().parse(o.toString()));
                Member member = new Member(memJson);
                list.add(member);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    private List<Rank> gRank(JSONArray json){
        List<Rank> list = new ArrayList<>();
        for(Object o : json){
            try {
                JSONObject rankJson = ((JSONObject) new JSONParser().parse(o.toString()));
                Rank rank = new Rank(rankJson);
                list.add(rank);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getCoins() {
        return coins;
    }
    public int getCoinsEver() {
        return coinsEver;
    }
    public Long getCreated() {
        return created;
    }
    public List<Member> getMembers() {
        return members;
    }
    public List<Rank> getRanks() {
        return ranks;
    }

    private JSONObject jsonGetRequest(String urlQueryString) throws ParseException {
        String json = null;
        try {
            URL url = new URL(urlQueryString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.connect();
            InputStream inStream = connection.getInputStream();
            json = streamToString(inStream); // input stream to string
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return (JSONObject) new JSONParser().parse(json);
    }

    private String streamToString(InputStream inputStream) {
        String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
        return text;
    }
}
