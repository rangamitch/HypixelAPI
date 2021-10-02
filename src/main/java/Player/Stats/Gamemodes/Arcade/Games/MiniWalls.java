package Player.Stats.Gamemodes.Arcade.Games;

import org.json.simple.JSONObject;

public class MiniWalls {

    private JSONObject json;

    public MiniWalls(JSONObject json){
        this.json = json;
    }

    public int getKills() {
        return Integer.parseInt(json.get("kills_mini_walls").toString());
    }

    public int getDeaths() {
        return Integer.parseInt(json.get("deaths_mini_walls").toString());
    }

    public int getWitherKills() {
        return Integer.parseInt(json.get("wither_kills_mini_walls").toString());
    }

    public int getFinalKills() {
        return Integer.parseInt(json.get("final_kills_mini_walls").toString());
    }

    public int getWins() {
        return Integer.parseInt(json.get("wins_mini_walls").toString());
    }

    public int getArrowsHit() {
        return Integer.parseInt(json.get("arrows_hit_mini_walls").toString());
    }

    public int getArrowsShot() {
        return Integer.parseInt(json.get("arrows_shot_mini_walls").toString());
    }

    public int getWitherDamage() {
        return Integer.parseInt(json.get("wither_damage_mini_walls").toString());
    }

}
