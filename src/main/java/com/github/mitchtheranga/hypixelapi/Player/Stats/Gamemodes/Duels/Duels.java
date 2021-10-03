package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Duels;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Duels.Modes.*;

public class Duels {

    private JSONObject json;

    public Duels(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("Duels ").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public Blitz getBlitz(){
        return new Blitz(json);
    }

    public Bow getBow(){
        return new Bow(json);
    }

    public Classic getClassic(){
        return new Classic(json);
    }

    public MegaWalls getMegaWalls(){
        return new MegaWalls(json);
    }

    public OP getOP(){
        return new OP(json);
    }

    public Skywars getSkywars1v1(){
        return new Skywars(json);
    }

    public Skywars2v2 getSkywars2v2(){
        return new Skywars2v2(json);
    }

    public Sumo getSumo(){
        return new Sumo(json);
    }

    public UHC1v1 getUHC1v1(){
        return new UHC1v1(json);
    }

    public UHC2v2 getUHC2v2(){
        return new UHC2v2(json);
    }
}
