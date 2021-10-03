package com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class Team {
    private final JSONObject json;

    public Team(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_teams").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_teams").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_teams").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_teams").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_teams").toString());
    }
}
