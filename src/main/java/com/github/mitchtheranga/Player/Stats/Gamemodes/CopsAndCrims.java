package com.github.mitchtheranga.Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CopsAndCrims {
    private JSONObject json;
    public CopsAndCrims(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("MCGO").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("deaths").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }

    public int getCopKills(){
        return Integer.parseInt(json.get("cop_kills").toString());
    }

    public int getCriminalKills(){
        return Integer.parseInt(json.get("criminal_kills").toString());
    }

    public int getHeadshotKills(){
        return Integer.parseInt(json.get("headshot_kills").toString());
    }

    public int getDeathMatchKills(){
        return Integer.parseInt(json.get("kills_deathmatch").toString());
    }

    public int getPlants(){
        return Integer.parseInt(json.get("bombs_planted").toString());
    }

    public int getDefuses(){
        return Integer.parseInt(json.get("bombs_defused").toString());
    }

    public int getShots(){
        return Integer.parseInt(json.get("shots_fired").toString());
    }
}
