package com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars;

import com.github.mitchtheranga.Player.Stats.Gamemodes.Skywars.Modes.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Skywars {
    private JSONObject json;

    public Skywars(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("SkyWars").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins ").toString());
    }

    public int getSouls(){
        return Integer.parseInt(json.get("souls").toString());
    }

    public Mega getMega(){
        return new Mega(json);
    }

    public MegaNormal getMegaNormal(){
        return new MegaNormal(json);
    }

    public Overall getOverall(){
        return new Overall(json);
    }

    public Ranked getRanked(){
        return new Ranked(json);
    }

    public RankedNormal getRankedNormal(){
        return new RankedNormal(json);
    }

    public Solo getSolo(){
        return new Solo(json);
    }

    public SoloInsane getSoloInsane(){
        return new SoloInsane(json);
    }

    public SoloNormal getSoloNormal(){
        return new SoloNormal(json);
    }

    public Team getTeam(){
        return new Team(json);
    }

    public TeamInsane getTeamInsane(){
        return new TeamInsane(json);
    }
    public TeamNormal getTeamNormal(){
        return new TeamNormal(json);
    }


}
