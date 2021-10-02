package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.MurderMystery.Modes;

import org.json.simple.JSONObject;

public class Classic {
    private JSONObject json;

    public Classic(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_MURDER_CLASSIC").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_MURDER_CLASSIC").toString());
    }

    public int getBowKills(){
        return Integer.parseInt(json.get("bow_kills_MURDER_CLASSIC").toString());
    }

    public int getKnifeKills(){
        return Integer.parseInt(json.get("knife_kills_MURDER_CLASSIC").toString());
    }

    public int getThrownKnifeKills(){
        return Integer.parseInt(json.get("thrown_knife_kills_MURDER_CLASSIC").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("deaths_MURDER_CLASSIC").toString());
    }
}
