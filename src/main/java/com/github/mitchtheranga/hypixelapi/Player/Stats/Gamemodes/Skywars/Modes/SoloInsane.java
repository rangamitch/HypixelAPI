package com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class SoloInsane {
    private final JSONObject json;

    public SoloInsane(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_solo_insane").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_solo_insane").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_solo_insane").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_solo_insane").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_solo_insane").toString());
    }
}
