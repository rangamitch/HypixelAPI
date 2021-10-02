package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Blitz {

    private JSONObject json;

    public Blitz(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("HungerGames").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }
    public int getDeaths(){
        return Integer.parseInt(json.get("deaths").toString());
    }
    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }
    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }
    public int getWinsTeams(){
        return Integer.parseInt(json.get("wins_teams").toString());
    }
}
