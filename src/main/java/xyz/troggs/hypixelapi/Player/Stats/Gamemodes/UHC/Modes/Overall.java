package xyz.troggs.hypixelapi.Player.Stats.Gamemodes.UHC.Modes;

import org.json.simple.JSONObject;

public class Overall {
    private JSONObject json;

    public Overall(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("deaths").toString());
    }

    public int getHeadsEaten(){
        return Integer.parseInt(json.get("heads_eaten").toString());
    }
}
