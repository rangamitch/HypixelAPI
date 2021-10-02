package com.github.mitchtheranga.Player.Stats.Gamemodes.Duels.Modes;

import org.json.simple.JSONObject;

public class MegaWalls {
    private JSONObject json;

    public MegaWalls(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("mw_duel_wins").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("mw_duel_kills").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("mw_duel_losses").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("mw_duel_deaths").toString());
    }

    public int getBowHits(){
        return Integer.parseInt(json.get("mw_duel_bow_hits").toString());
    }

    public int getBowShots(){
        return Integer.parseInt(json.get("mw_duel_bow_shots").toString());
    }

    public int getMeleeHits(){
        return Integer.parseInt(json.get("mw_duel_melee_hits").toString());
    }

    public int getDamageDealt(){
        return Integer.parseInt(json.get("mw_duel_damage_dealt").toString());
    }

    public int getRoundsPlayed(){
        return Integer.parseInt(json.get("mw_duel_rounds_played").toString());
    }

    public int getMeleeSwings(){
        return Integer.parseInt(json.get("mw_duel_melee_swings").toString());
    }

    public int getBestWinStreak(){
        return Integer.parseInt(json.get("duels_winstreak_best_mw_duel").toString());
    }
}
