package game.netent.Entity.Games.NetJackEnt.Rounds;

import game.netent.Entity.Player;
import game.netent.Entity.Round;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class Free extends Round{

    private String type = "free";

    public int cost = 0;

    public Free(Player player) {
        super(player);

    }
}
