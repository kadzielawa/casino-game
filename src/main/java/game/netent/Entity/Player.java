package game.netent.Entity;

public class Player {

    private int winGames;

    private int balance;

    private int lostGames;

    public void win(int coins){
        this.winGames++;
        this.balance += coins;
    }

    public void lost(){
        this.lostGames++;
    }

    public int getBalance(){
        return this.balance;
    }

    public int getLostGames() {
        return this.lostGames;
    }

    public int getWinGames() {
        return this.winGames;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
