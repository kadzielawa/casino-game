package game.netent.Entity;

import org.json.JSONException;

public abstract class Game {

    public String name;

    public abstract String result(Round round) throws JSONException;

    public String getName() {
        return name;
    }

}
