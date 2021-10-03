package com.github.mitchtheranga.hypixelapi.Player.Stats;

import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Arcade.Arcade;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Bedwars.Bedwars;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Duels.Duels;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.MurderMystery.MurderMystery;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Skywars.Skywars;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.UHC.UHC;
import org.json.simple.JSONObject;
import com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.*;

public class Stats {

    private final JSONObject json;

    public Stats(JSONObject json){
        this.json = json;
    }

    public Arcade getArcade() {
        return new Arcade(json);
    }

    public Bedwars getBedwars() {
        return new Bedwars(json);
    }

    public Blitz getBlitz(){
        return new Blitz(json);
    }

    public BuildBattle getBuildBattle(){
        return new BuildBattle(json);
    }

    public Duels getDuels() {
        return new Duels(json);
    }

    public MegaWalls getMegaWalls() {
        return new MegaWalls(json);
    }

    public MurderMystery getMurderMystery() {
        return new MurderMystery(json);
    }

    public Skywars getSkywars() {
        return new Skywars(json);
    }

    public Smash getSmash() {
        return new Smash(json);
    }

    public SpeedUHC getSpeedUHC() {
        return new SpeedUHC(json);
    }

    public UHC getUHC() {
        return new UHC(json);
    }

    public TNT getTNT() {
        return new TNT(json);
    }

    public CopsAndCrims getCopsAndCrims() {
        return new CopsAndCrims(json);
    }

}
