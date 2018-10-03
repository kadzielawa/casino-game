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
    @Override
    public String result() {

        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("is_free",1);
            jsonObject.put("is_win",this.win);
            jsonObject.put("round_type",this.type);
            jsonObject.put("player_balance",player.getBalance());
            jsonObject.put("win_games",player.getWinGames());
            jsonObject.put("lost_games",player.getLostGames());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();

    }
}
