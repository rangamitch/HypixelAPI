package Player.Stats.Gamemodes.Duels.Modes;

import org.json.simple.JSONObject;

public class UHC2v2 {
    private JSONObject json;

    public UHC2v2(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("uhc_doubles_wins").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("uhc_doubles_kills").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("uhc_doubles_losses").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("uhc_doubles_deaths").toString());
    }

    public int getBowHits(){
        return Integer.parseInt(json.get("uhc_doubles_bow_hits").toString());
    }

    public int getBowShots(){
        return Integer.parseInt(json.get("uhc_doubles_bow_shots").toString());
    }

    public int getMeleeHits(){
        return Integer.parseInt(json.get("uhc_doubles_melee_hits").toString());
    }

    public int getDamageDealt(){
        return Integer.parseInt(json.get("uhc_doubles_damage_dealt").toString());
    }

    public int getRoundsPlayed(){
        return Integer.parseInt(json.get("uhc_doubles_rounds_played").toString());
    }

    public int getMeleeSwings(){
        return Integer.parseInt(json.get("uhc_doubles_melee_swings").toString());
    }

    public int getBestWinStreak(){
        return Integer.parseInt(json.get("duels_winstreak_best_uhc_doubles").toString());
    }
}
