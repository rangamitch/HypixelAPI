package Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MegaWalls {
    private JSONObject json;

    public MegaWalls(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("Walls3").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }

    public int getDeaths(){
        return Integer.parseInt(json.get("deaths").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists").toString());
    }

    public int getFinalKills(){
        return Integer.parseInt(json.get("finalKills").toString());
    }

    public int getFinalAssists(){
        return Integer.parseInt(json.get("finalAssists").toString());
    }

    public int getFinalDeaths(){
        return Integer.parseInt(json.get("finalDeaths").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses").toString());
    }
}
