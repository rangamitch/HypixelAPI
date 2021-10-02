package com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class Ranked {
    private JSONObject json;

    public Ranked(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_ranked").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_ranked").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_ranked").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_ranked").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_ranked").toString());
    }
}
