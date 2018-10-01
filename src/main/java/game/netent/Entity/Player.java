package game.netent.Entity;

public class Player {

    static int winGames;

    private int balance;

    static int lostGames;


    public void win(int coins){
        winGames++;
        this.balance += coins;
    }

}
