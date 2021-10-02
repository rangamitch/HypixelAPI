package Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class TeamInsane {
    private JSONObject json;

    public TeamInsane(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_teams_insane").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_teams_insane").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_teams_insane").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_teams_insane").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_teams_insane").toString());
    }
}
