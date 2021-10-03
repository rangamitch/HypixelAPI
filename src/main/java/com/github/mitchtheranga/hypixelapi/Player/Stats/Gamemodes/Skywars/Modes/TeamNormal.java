package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class TeamNormal {
    private final JSONObject json;

    public TeamNormal(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_teams_normal").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_teams_normal").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_teams_normal").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_teams_normal").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_teams_normal").toString());
    }
}
