package Player.Stats.Gamemodes.Bedwars.Modes;

import org.json.simple.JSONObject;

public class AllCoreModes {

    private JSONObject json;

    public AllCoreModes(JSONObject json) {
        this.json = json;
    }

    public int getFinalKills() {
        return Integer.parseInt(json.get("final_kills_bedwars").toString());
    }
    public int getFinalDeaths() {
        return Integer.parseInt(json.get("final_deaths_bedwars").toString());
    }
    public int getWins() {
        return Integer.parseInt(json.get("wins_bedwars").toString());
    }
    public int getLosses() {
        return Integer.parseInt(json.get("losses_bedwars").toString());
    }
    public int getKills() {
        return Integer.parseInt(json.get("kills_bedwars").toString());
    }
    public int getDeaths() {
        return Integer.parseInt(json.get("deaths_bedwars").toString());
    }
    public int getBedsBroken() {
        return Integer.parseInt(json.get("beds_broken_bedwars").toString());
    }
    public int getBedsLost() {
        return Integer.parseInt(json.get("beds_lost_bedwars").toString());
    }
    public int getWinStreak() {
        return Integer.parseInt(json.get("winstreak").toString());
    }
    public int getGamesPlayed() {
        return Integer.parseInt(json.get("games_played_bedwars").toString());
    }
}
