package Player.Stats.Gamemodes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SpeedUHC {
    private JSONObject json;

    public SpeedUHC(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("SpeedUHC").toString());
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

    public int getLosses(){
        return Integer.parseInt(json.get("losses").toString());
    }
}
