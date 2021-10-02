package xyz.troggs.hypixelapi;

import xyz.troggs.hypixelapi.Guild.Guild;
import xyz.troggs.hypixelapi.Player.Player;

public class HypixelAPI {

    public String apiKey;

    public HypixelAPI(String apiKey){
        this.apiKey = apiKey;
    }

    public Guild getGuildById(String id){
        return new Guild(id, true, apiKey);
    }
    public Guild getGuildName(String name){
        return new Guild(name, false, apiKey);
    }

    public Player getPlayerByUUID(String uuid){
        return new Player(uuid, true, apiKey);
    }
    public Player getPlayerByIGN(String ign){
        return new Player(ign, false, apiKey);
    }
}
