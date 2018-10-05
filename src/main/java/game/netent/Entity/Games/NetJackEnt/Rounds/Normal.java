package game.netent.Entity.Games.NetJackEnt.Rounds;

import game.netent.Entity.Player;
import game.netent.Entity.Round;
import org.json.JSONException;
import org.json.JSONObject;

public class Normal extends Round {

    private String type = "normal";

    public int cost = 10;

    public Normal(Player player) {
        super(player);
        player.payForRound(cost);
    }

}
