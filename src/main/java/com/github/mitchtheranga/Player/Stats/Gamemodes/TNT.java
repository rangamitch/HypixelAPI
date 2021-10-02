package com.github.mitchtheranga.Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TNT {
    private JSONObject json;

    public TNT(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("TNTGames").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getTNTRunWins(){
        return Integer.parseInt(json.get("wins_tntrun").toString());
    }

    public int getTNTRunDeaths(){
        return Integer.parseInt(json.get("deaths_tntrun").toString());
    }

    public int getTNTTagWins(){
        return Integer.parseInt(json.get("wins_tntag").toString());
    }

    public int getTNTTagKills(){
        return Integer.parseInt(json.get("kills_tntag").toString());
    }

    public int getPVPRunKills(){
        return Integer.parseInt(json.get("kills_pvprun").toString());
    }

    public int getPVPRunWins(){
        return Integer.parseInt(json.get("wins_pvprun").toString());
    }

    public int getPVPRunDeaths(){
        return Integer.parseInt(json.get("deaths_pvprun").toString());
    }

    public int getBowSpleefWins(){
        return Integer.parseInt(json.get("wins_bowspleef").toString());
    }

    public int getBowSpleefDeaths(){
        return Integer.parseInt(json.get("deaths_bowspleef").toString());
    }

    public int getBowSpleefTags(){
        return Integer.parseInt(json.get("tags_bowspleef").toString());
    }
}
