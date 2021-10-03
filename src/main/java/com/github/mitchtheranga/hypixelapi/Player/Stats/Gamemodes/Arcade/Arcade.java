package com.github.mitchtheranga.Player.Stats.Gamemodes.Arcade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.github.mitchtheranga.Player.Stats.Gamemodes.Arcade.Games.HoleInTheWall;
import com.github.mitchtheranga.Player.Stats.Gamemodes.Arcade.Games.MiniWalls;
import com.github.mitchtheranga.Player.Stats.Gamemodes.Arcade.Games.OneInTheQuiver;

public class Arcade {

    private JSONObject json;

    public Arcade(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("Arcade").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public double getCoins() {
        return Double.parseDouble(json.get("coins").toString());
    }

    public MiniWalls getMiniWalls() {
        return new MiniWalls(json);
    }

    public OneInTheQuiver getOneInTheQuiver(){
        return new OneInTheQuiver(json);
    }

    public HoleInTheWall getHoleInTheWall(){
        return new HoleInTheWall(json);
    }
}
