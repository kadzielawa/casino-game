package game.netent.Entity.Games.NetJackEnt;

import game.netent.Entity.Game;
import game.netent.Entity.Games.NetJackEnt.Rounds.Free;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;
import game.netent.Entity.Player;
import game.netent.Entity.Round;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;

public class NetJackEnt extends Game {

    public String name = "netjackent";
    public String type = "slot machine";

    public String getName() {
        return name;
    }

    public String spin(Player player) {

        Round round = new Normal(player);
        Random random = new Random();
        int chance = random.nextInt(101);
       //win!
        if(chance >= 70){
            round.win = true;
            player.win(20);
        }
        else {
            round.lost = true;
            player.lost();

        }

        if(chance >= 90) {
            round =  new Free(player);
            player.freeRound();
            this.spin(player);
        }
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("is_win",round.win);
            jsonObject.put("free_rounds",player.getFreeRounds());
            jsonObject.put("player_balance",player.getBalance());
            jsonObject.put("win_games",player.getWinGames());
            jsonObject.put("lost_games",player.getLostGames());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }

}
