package com.github.mitchtheranga.Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Smash {
    private JSONObject json;

    public Smash(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("SuperSmash").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getLevel(){
        return Integer.parseInt(json.get("smashLevel").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("deaths").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }
}
