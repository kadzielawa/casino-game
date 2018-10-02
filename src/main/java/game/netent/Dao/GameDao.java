package game.netent.Dao;

import game.netent.Entity.Game;
import game.netent.Entity.Games.NetJackEnt.NetJackEnt;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class GameDao {

private static Map<Integer,Game> games;

static {

    games = new HashMap<Integer,Game>() {
        {
            put(1,new NetJackEnt());

        }
    };
}

    public Collection<Game> getAllGames() {

        return games.values();
    }

    public Game getGameByName(String name) {

        Map.Entry<Integer, Game> game =  games
                .entrySet()
                .stream()
                .filter(
                        a ->a.getValue()
                                .getName()
                                .contains(name))
                .findFirst()
                .orElse(null);

        return game.getValue();
    }


}
