package game.netent.Controller;

import game.netent.Entity.Game;
import game.netent.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public String games( Model model){

        Collection<Game> games = gameService.getAllGames();
        model.addAttribute("games", games);

        return "games";
    }

    @GetMapping(value="/game/{name}")
    public String game(@PathVariable(value="name") String name, Model model){

        Game game = gameService.getGameByName(name);
        model.addAttribute("game", game);

        return "gameslist/"+ name;
    }
}
