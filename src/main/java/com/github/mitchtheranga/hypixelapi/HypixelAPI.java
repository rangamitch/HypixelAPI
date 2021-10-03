package com.github.mitchtheranga.hypixelapi;

import com.github.mitchtheranga.hypixelapi.Guild.Guild;
import com.github.mitchtheranga.Player.Player;

public class HypixelAPI {

    public String apiKey;

    public HypixelAPI(String apiKey){
        this.apiKey = apiKey;
    }

    public Guild getGuildById(String id){
        return new Guild(id, true, apiKey);
    }
    public Guild getGuildByName(String name){
        return new Guild(name, false, apiKey);
    }

    public Player getPlayerByUUID(String uuid){
        return new Player(uuid, true, apiKey);
    }
    public Player getPlayerByIGN(String ign){
        return new Player(ign, false, apiKey);
    }
}
