package xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Bedwars.Modes;

import org.json.simple.JSONObject;

public class Fours {

    private JSONObject json;

    public Fours(JSONObject json) {
        this.json = json;
    }

    public int getFinalKills() {
        return Integer.parseInt(json.get("four_four_final_kills_bedwars").toString());
    }
    public int getFinalDeaths() {
        return Integer.parseInt(json.get("four_four_final_deaths_bedwars").toString());
    }
    public int getWins() {
        return Integer.parseInt(json.get("four_four_wins_bedwars").toString());
    }
    public int getLosses() {
        return Integer.parseInt(json.get("four_four_losses_bedwars").toString());
    }
    public int getKills() {
        return Integer.parseInt(json.get("four_four_kills_bedwars").toString());
    }
    public int getDeaths() {
        return Integer.parseInt(json.get("four_four_deaths_bedwars").toString());
    }
    public int getBedsBroken() {
        return Integer.parseInt(json.get("four_four_beds_broken_bedwars").toString());
    }
    public int getBedsLost() {
        return Integer.parseInt(json.get("four_four_beds_lost_bedwars").toString());
    }
    public int getWinStreak() {
        return Integer.parseInt(json.get("four_four_winstreak").toString());
    }
    public int getGamesPlayed() {
        return Integer.parseInt(json.get("four_four_games_played_bedwars").toString());
    }
}
