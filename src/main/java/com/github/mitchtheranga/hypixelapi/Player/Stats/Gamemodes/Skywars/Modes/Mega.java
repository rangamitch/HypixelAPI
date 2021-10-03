package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class Mega {
    private final JSONObject json;

    public Mega(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_mega").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_mega").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_mega").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_mega").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_mega").toString());
    }
}
