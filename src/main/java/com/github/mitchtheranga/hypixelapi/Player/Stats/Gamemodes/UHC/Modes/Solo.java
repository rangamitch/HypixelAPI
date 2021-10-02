package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.UHC.Modes;

import org.json.simple.JSONObject;

public class Solo {
    private JSONObject json;

    public Solo(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_solo").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_solo").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("deaths_solo").toString());
    }

    public int getHeadsEaten(){
        return Integer.parseInt(json.get("heads_eaten_solo").toString());
    }
}
