package game.netent.Entity;

public abstract class Game {

    public String name;

    public abstract void start();

    public abstract void result();

    public String getName() {
        return name;
    }

}
