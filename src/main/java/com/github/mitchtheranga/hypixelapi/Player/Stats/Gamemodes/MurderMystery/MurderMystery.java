package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.MurderMystery;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.MurderMystery.Modes.*;

public class MurderMystery {
    private JSONObject json;

    public MurderMystery(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("MurderMystery").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public Assassins getAssassins(){
        return new Assassins(json);
    }

    public Classic getClassic(){
        return new Classic(json);
    }

    public DoubleUp getDoubleUp(){
        return new DoubleUp(json);
    }
}
