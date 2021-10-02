package Player.Stats.Gamemodes.Bedwars;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import Player.Stats.Gamemodes.Bedwars.Modes.*;

public class Bedwars {

    private JSONObject json;

    public Bedwars(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("Bedwars").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public AllCoreModes getAllCoreModes() {
        return new AllCoreModes(json);
    }
    public Solos getSolos() {
        return new Solos(json);
    }
    public Doubles getDoubles() {
        return new Doubles(json);
    }
    public Threes getThrees() {
        return new Threes(json);
    }
    public Fours getFours() {
        return new Fours(json);
    }

    public int getCoins() {
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getExperience() {
        return Integer.parseInt(json.get("Experience").toString());
    }

    public int getCrates() {
        return Integer.parseInt(json.get("Experience").toString());
    }
}
