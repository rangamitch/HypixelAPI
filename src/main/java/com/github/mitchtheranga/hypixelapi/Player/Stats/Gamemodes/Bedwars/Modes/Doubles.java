package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Bedwars.Modes;

import org.json.simple.JSONObject;

public class Doubles {
    
    private final JSONObject json;

    public Doubles(JSONObject json) {
        this.json = json;
    }

    public int getFinalKills() {
        return Integer.parseInt(json.get("eight_two_final_kills_bedwars").toString());
    }
    public int getFinalDeaths() {
        return Integer.parseInt(json.get("eight_two_final_deaths_bedwars").toString());
    }
    public int getWins() {
        return Integer.parseInt(json.get("eight_two_wins_bedwars").toString());
    }
    public int getLosses() {
        return Integer.parseInt(json.get("eight_two_losses_bedwars").toString());
    }
    public int getKills() {
        return Integer.parseInt(json.get("eight_two_kills_bedwars").toString());
    }
    public int getDeaths() {
        return Integer.parseInt(json.get("eight_two_deaths_bedwars").toString());
    }
    public int getBedsBroken() {
        return Integer.parseInt(json.get("eight_two_beds_broken_bedwars").toString());
    }
    public int getBedsLost() {
        return Integer.parseInt(json.get("eight_two_beds_lost_bedwars").toString());
    }
    public int getWinStreak() {
        return Integer.parseInt(json.get("eight_two_winstreak").toString());
    }
    public int getGamesPlayed() {
        return Integer.parseInt(json.get("eight_two_games_played_bedwars").toString());
    }
}
