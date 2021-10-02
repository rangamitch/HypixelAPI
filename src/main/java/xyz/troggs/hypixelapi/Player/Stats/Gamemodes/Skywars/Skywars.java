package xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Skywars;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Skywars {
    private JSONObject json;

    public Skywars(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("SkyWars").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }
}
