package xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class MegaNormal {
    private JSONObject json;

    public MegaNormal(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_mega_normal").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_mega_normal").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_mega_normal").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_mega_normal").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_mega_normal").toString());
    }
}
