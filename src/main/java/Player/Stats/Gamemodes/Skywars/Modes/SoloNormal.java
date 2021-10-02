package Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class SoloNormal {
    private JSONObject json;

    public SoloNormal(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills_solo_normal").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins_solo_normal").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists_solo_normal").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_solo_normal").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses_solo_normal").toString());
    }
}
