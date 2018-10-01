package game.netent.Entity.Games.NetJackEnt;

import game.netent.Entity.Game;
import game.netent.Entity.Player;
import game.netent.Entity.Round;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;

public class NetJackEnt extends Game {

    public String name = "netjackent";
    public String type = "slot machine";

    @Override
    public void start() {
        Player player= new Player();
        Round round = new Normal();
        Round returnedRound = round.spin(player);


    }

    @Override
    public void result() {

    }


    public String getName() {
        return name;
    }
}
