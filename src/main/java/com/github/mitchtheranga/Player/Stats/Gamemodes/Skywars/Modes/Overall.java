package com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class Overall {
    private JSONObject json;

    public Overall(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses").toString());
    }
}
