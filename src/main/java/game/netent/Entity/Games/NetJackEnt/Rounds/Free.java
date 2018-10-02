package game.netent.Entity.Games.NetJackEnt.Rounds;

import game.netent.Entity.Round;

public class Free extends Round{

    private String type = "free";

    private int cost = 0;

    @Override
    public String result() {
        return this.type;
    }
}
