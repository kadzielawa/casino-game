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
        this.payForRound(cost);

    }

    @Override
    public String result() {

        JSONObject jsonObject = new JSONObject();

        try {
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
