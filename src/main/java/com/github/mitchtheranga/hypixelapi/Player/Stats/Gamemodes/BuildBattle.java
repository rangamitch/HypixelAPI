package com.github.mitchtheranga.Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BuildBattle {
    private JSONObject json;

    public BuildBattle(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("BuildBattle").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }

    public int getWinsTeamsNormal(){
        return Integer.parseInt(json.get("wins_teams_normal").toString());
    }

    public int getWinsSolosNormal(){
        return Integer.parseInt(json.get("wins_solo_normal").toString());
    }

    public int getGamesPlayed(){
        return Integer.parseInt(json.get("games_played").toString());
    }

    public int getScore(){
        return Integer.parseInt(json.get("score").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }


    public int getWinsGTB(){
        return Integer.parseInt(json.get("wins_guess_the_build").toString());
    }

    public int getWinsSoloPro(){
        return Integer.parseInt(json.get("wins_solo_pro").toString());
    }
}
