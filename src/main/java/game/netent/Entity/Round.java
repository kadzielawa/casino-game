package game.netent.Entity;

import game.netent.Entity.Games.NetJackEnt.Rounds.Free;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Random;

public abstract class Round {

    public Player player;

    private String type;

    private boolean lost;

    public boolean win;

    public abstract String result();

    public String getType() {
        return type;
    }

    public Round(Player player){
        this.player = player;
    }

    public Round spin() {
        Random random = new Random();
        int chance = random.nextInt(101);
        Round resultRound = this.getResultRound(chance);

        return resultRound;
    }

    private Round getResultRound(int chance){

            Round resultRound = this;
            //get free round
            if(chance >= 90) {
                resultRound = new Free(player);
            }
            //win!
            else if(chance >= 60){
                resultRound.win = true;
                player.win(20);
                Random randomForFree = new Random();
                int chanceForFree = randomForFree.nextInt(101);

                if(chanceForFree >= 90) {
                    resultRound = new Free(player);
                }
            }
             else {
                resultRound.lost = true;
                player.lost();

            }

            return resultRound;
    }

    public void payForRound(int cost) {
        int newBalance = player.getBalance() - cost;

        if(newBalance < 0){
          //  System.out.println("GAME OVER");
        }
        player.setBalance(newBalance);
    }
}
