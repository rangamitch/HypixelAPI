package xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Arcade.Games;

import org.json.simple.JSONObject;

public class OneInTheQuiver {

    private JSONObject json;

    public OneInTheQuiver(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_oneinthequiver").toString());
    }
    public int getKills(){
        return Integer.parseInt(json.get("kills_oneinthequiver").toString());
    }
    public int getDeaths(){
        return Integer.parseInt(json.get("deaths_oneinthequiver").toString());
    }
    public int getBountyKills(){
        return Integer.parseInt(json.get("bounty_kills_oneinthequiver").toString());
    }
}
