package game.netent.Entity;

public abstract class Game {

    public String name;

    public abstract String result(Round round);

    public String getName() {
        return name;
    }

}
