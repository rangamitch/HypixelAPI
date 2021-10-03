package com.github.mitchtheranga.hypixelapi.Player;

import com.github.mitchtheranga.hypixelapi.Player.Stats.Stats;
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

public class Player {

    private JSONObject json;

    public Player(String identifier, boolean isId, String apiKey){
        JSONObject json;
        String url = "https://api.hypixel.net/player?key=" + apiKey + (isId ? "&uuid=" : "&name=") + identifier;
        try{
            json = ((JSONObject) new JSONParser().parse(jsonGetRequest(url).get("player").toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        this.json = json;
    }

    public JSONObject getJson(){
        return json;
    }

    public String getId() {
        return json.get("_id").toString();
    }

    public String getUuid() {
        return json.get("uuid").toString();
    }

    public Stats getStats() {
        Stats stats;
        try{
            stats = new Stats((JSONObject) new JSONParser().parse(json.get("stats").toString()));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        return stats;
    }

    public String getDisplayName() {
        return json.get("displayname").toString();
    }

    public String getPlayerName() {
        return json.get("playername").toString();
    }

    public List<String> getKnownAliases() {
        List<String> aliases = new ArrayList<>();
        try {
            for (Object o : ((JSONArray) new JSONParser().parse(json.get("knownAliases").toString())).toArray()) {
                aliases.add(o.toString());
            }
        } catch (ParseException e) {
        }
        return aliases;
    }

    public List<String> getKnownAliasesLower() {
        List<String> aliases = new ArrayList<>();
        try {
            for (Object o : ((JSONArray) new JSONParser().parse(json.get("knownAliasesLower").toString())).toArray()) {
                aliases.add(o.toString());
            }
        } catch (ParseException e) {
        }
        return aliases;
    }

    public String getRank(){
        return json.get("rank") != null ? json.get("rank").toString() : json.get("monthlyPackageRank") == null ? json.get("newPackageRank") == null ? "DEFAULT" : json.get("newPackageRank").toString() : json.get("monthlyPackageRank").toString().equalsIgnoreCase("NONE") ? json.get("newPackageRank").toString() : json.get("monthlyPackageRank").toString();
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
