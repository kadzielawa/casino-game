package game.netent.Entity;

public class Player {

    private int winGames;

    private int balance = 10000;

    private int lostGames;
    private int freeRounds;

    public void win(int coins){
        this.winGames++;
        this.balance += coins;
    }

    public void lost(){
        this.lostGames++;
    }
    public void freeRound(){
        this.freeRounds++;
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

    public int getFreeRounds() {
        return freeRounds;
    }

    public void payForRound(int cost) {
        int newBalance = balance - cost;
        setBalance(newBalance);
    }
}
