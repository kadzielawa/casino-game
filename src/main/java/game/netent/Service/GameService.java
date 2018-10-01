package game.netent.Service;

import game.netent.Dao.GameDao;
import game.netent.Entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GameService {

    @Autowired
    private GameDao gameDao;

    public Collection<Game> getAllGames(){

        return gameDao.getAllGames();
    }

    public Game getGameByName(String name){

        return gameDao.getGameByName(name);
    }
}
