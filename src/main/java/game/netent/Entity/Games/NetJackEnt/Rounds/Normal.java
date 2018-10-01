package game.netent.Entity.Games.NetJackEnt.Rounds;

import game.netent.Entity.Player;
import game.netent.Entity.Round;

import java.util.Random;

public class Normal extends Round {

    private String type = "normal";

    private int cost = 10;

    public void process(Player player) {

        Random random = new Random();

        int chance = random.nextInt(101);

        //win!
        if(chance >= 30){
            player.win(20);
        }
        //get free round
        else if(chance >= 10) {
            Round freeRound = new Free();
       }

       return


    }

}
