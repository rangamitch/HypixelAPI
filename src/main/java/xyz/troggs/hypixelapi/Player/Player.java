package xyz.troggs.hypixelapi.Player;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import xyz.troggs.hypixelapi.Player.Stats.Stats;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String id;
    private String uuid;
    private String displayName;
    private String playerName;
    private List<String> knownAliases;
    private List<String> knownAliasesLower;

    private Stats stats;

    public Player(String identifier, boolean isId, String apiKey){
        JSONObject json;
        String url = "https://api.hypixel.net/player?key=" + apiKey + (isId ? "&uuid=" : "&name=") + identifier;
        try{
            json = ((JSONObject) new JSONParser().parse(jsonGetRequest(url).get("player").toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        this.id = json.get("_id").toString();
        this.uuid = json.get("uuid").toString();
        this.displayName = json.get("displayname").toString();
        this.playerName = json.get("playername").toString();
        try{
            List<String> aliases = new ArrayList<>();
            List<String> aliasesLower = new ArrayList<>();
            for(Object o : ((JSONArray) new JSONParser().parse(json.get("knownAliases").toString())).toArray()){
                aliases.add(o.toString());
            }
            for(Object o : ((JSONArray) new JSONParser().parse(json.get("knownAliasesLower").toString())).toArray()){
                aliasesLower.add(o.toString());
            }
            this.knownAliases = aliases;
            this.knownAliasesLower = aliasesLower;
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        try{
            this.stats = new Stats((JSONObject) new JSONParser().parse(json.get("stats").toString()));
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public String getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public Stats getStats() {
        return stats;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<String> getKnownAliases() {
        return knownAliases;
    }

    public List<String> getKnownAliasesLower() {
        return knownAliasesLower;
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
