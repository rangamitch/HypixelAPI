package xyz.troggs.hypixelapi.Guild;

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

public class Member {
    private String uuid;
    private String rank;
    private Long joined;
    private int questParticipation;

    private List<Integer> guildExpHistory;
    private int guildExp;

    public Member(JSONObject json){
        this.uuid = json.get("uuid").toString();
        this.rank = json.get("rank").toString();
        this.joined = Long.parseLong(json.get("joined").toString());
        try {
            this.questParticipation = Integer.parseInt(json.get("questParticipation").toString());
        } catch (NullPointerException e) {
            this.questParticipation = 0;
        }

        JSONObject gexpJson;
        try{
            gexpJson = ((JSONObject) new JSONParser().parse(json.get("expHistory").toString()));
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        List<Integer> expHistory = new ArrayList<>();
        int gexp = 0;
        for(Object o : gexpJson.values()){
            gexp += Integer.parseInt(o.toString());
            expHistory.add(Integer.parseInt(o.toString()));
        }
        this.guildExpHistory = expHistory;
        this.guildExp = gexp;
    }

    public String getUuid() {
        return uuid;
    }
    public String getRank() {
        return rank;
    }
    public Long getJoined() {
        return joined;
    }
    public int getQuestParticipation() {
        return questParticipation;
    }
    public List<Integer> getGuildExpHistory() {
        return guildExpHistory;
    }
    public int getGuildExp() {
        return guildExp;
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
