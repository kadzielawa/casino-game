package game.netent.Entity;

import game.netent.Entity.Games.NetJackEnt.Rounds.Free;

import java.util.Random;

public abstract class Round {

    private String type;

    public int cost;

    public boolean lost;

    public int win;

    public String getType() {
        return type;
    }

    protected void setCost(int cost){
        this.cost = cost;
    }

    public abstract String result();

    public Round spin(Player player) {

        Random random = new Random();

        int chance = random.nextInt(101);

        Round resultRound = this.getResultRound(chance);


        return resultRound;
    }

        private Round getResultRound(int chance){

            Round resultRound = this;
            //get free round
            if(chance >= 90) {
                resultRound = new Free();
            }
            //win!
            else if(chance >= 60){
                resultRound.win = 20;
                Random randomForFree = new Random();
                int chanceForFree = randomForFree.nextInt(101);

                if(chanceForFree >= 90) {
                    resultRound = new Free();
                }
            }
             else {
                resultRound.lost = true;
            }

            return resultRound;
    }
}
