package game.netent.Entity;

import game.netent.Entity.Games.NetJackEnt.Rounds.Free;

import java.util.Random;

public abstract class Round {

    private String type;

    public int cost;

    public int win;

    public String getType() {
        return type;
    }

    protected void setCost(int cost){
        this.cost = cost;
    }

    public Round spin(Player player) {

        Random random = new Random();

        int chance = random.nextInt(101);

        Round resultRound = this.getResultRound(chance);


        return resultRound;
    }

        private Round getResultRound(int chance){

            Round resultRound = this;

            //win!
            if(chance >= 30){
                resultRound.win = 20;
                Random randomForFree = new Random();
                int chanceForFree = randomForFree.nextInt(101);

                if(chanceForFree >= 10) {
                    resultRound = new Free();
                }
            }
            //get free round
            else if(chance >= 10) {
                resultRound = new Free();
            }

            return resultRound;
    }
}
