package xyz.troggs.hypixelapi.Player.Stats;

import org.json.simple.JSONObject;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.*;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Arcade.Arcade;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Bedwars.Bedwars;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Blitz;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.BuildBattle;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Duels.Duels;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.MurderMystery.MurderMystery;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.Skywars.Skywars;

public class Stats {

    public JSONObject json;

    private Arcade arcade = null;
    private Bedwars bedwars = null;
    private Blitz blitz = null;
    private BuildBattle buildBattle = null;
    private CopsAndCrims copsAndCrims = null;
    private Duels duels = null;
    private MegaWalls megaWalls = null;
    private MurderMystery murderMystery = null;
    private Skywars skywars = null;
    private Smash smash = null;
    private SpeedUHC speedUHC = null;
    private TNT tnt = null;
    private UHC uhc = null;
    private Warlords warlords = null;

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

    public CopsAndCrims getCopsAndCrims() {
        return new CopsAndCrims(json);
    }
}
