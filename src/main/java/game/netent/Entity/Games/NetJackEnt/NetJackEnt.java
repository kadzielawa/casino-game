package game.netent.Entity.Games.NetJackEnt;

import game.netent.Entity.Game;
import game.netent.Entity.Player;
import game.netent.Entity.Round;
import org.json.JSONException;

public class NetJackEnt extends Game {

    public String name = "netjackent";
    public String type = "slot machine";

    public String getName() {
        return name;
    }

    @Override
    public String result(Round round) {
        Round returnedRound = round.spin();
        return returnedRound.result();
    }


}
