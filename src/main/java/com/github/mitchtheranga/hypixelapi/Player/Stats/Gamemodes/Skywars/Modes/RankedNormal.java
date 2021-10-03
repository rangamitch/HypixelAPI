package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class RankedNormal {
    private final JSONObject json;

    public RankedNormal(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_ranked_normal").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_ranked_normal").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_ranked_normal").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_ranked_normal").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_ranked_normal").toString());
    }
}
