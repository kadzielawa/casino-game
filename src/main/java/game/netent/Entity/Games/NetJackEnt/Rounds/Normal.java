package game.netent.Entity.Games.NetJackEnt.Rounds;

import game.netent.Entity.Round;


public class Normal extends Round {

    private String type = "normal";

    private int cost = 10;

    @Override
    public String result() {

        String message;
        if (this.lost) {
            message = "Sorry, you lost round!";
        } else {
            message = "You won " + this.win + " coins! Congratulations!";
        }

        return message;

    }
}
