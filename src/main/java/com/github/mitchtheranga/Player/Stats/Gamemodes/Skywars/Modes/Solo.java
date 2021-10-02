package com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class Solo {
    private JSONObject json;

    public Solo(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_solo").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_solo").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_solo").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_solo").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_solo").toString());
    }
}
