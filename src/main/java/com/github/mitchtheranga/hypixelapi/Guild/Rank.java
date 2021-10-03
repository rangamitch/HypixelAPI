package com.github.mitchtheranga.hypixelapi.Guild;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Rank {
    private final String name;
    private final String tag;
    private final boolean isDefault;
    private final int priority;
    private final Long created;

    public Rank(JSONObject json){
        this.name = json.get("name").toString();
        this.tag = json.get("tag").toString();
        this.isDefault = Boolean.parseBoolean(json.get("default").toString());
        this.priority = Integer.parseInt(json.get("priority").toString());
        this.created = Long.parseLong(json.get("created").toString());
    }

    public String getName() {
        return name;
    }
    public String getTag() {
        return tag;
    }
    public boolean isDefault() {
        return isDefault;
    }
    public int getPriority() {
        return priority;
    }
    public Long getCreated() {
        return created;
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
