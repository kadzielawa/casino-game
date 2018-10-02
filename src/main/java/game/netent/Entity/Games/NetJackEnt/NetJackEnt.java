package game.netent.Entity.Games.NetJackEnt;

import game.netent.Entity.Game;
import game.netent.Entity.Player;
import game.netent.Entity.Round;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;

public class NetJackEnt extends Game {

    public String name = "netjackent";
    public String type = "slot machine";

    public String getName() {
        return name;
    }

    @Override
    public String result(Round round) {
        Player player = new Player();
        Round returnedRound = round.spin(player);
        return returnedRound.result();
    }


}
