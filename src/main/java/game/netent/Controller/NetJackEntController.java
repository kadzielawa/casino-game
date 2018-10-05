package game.netent.Controller;

import game.netent.Entity.Games.NetJackEnt.NetJackEnt;
import game.netent.Entity.Games.NetJackEnt.Rounds.Free;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;
import game.netent.Entity.Player;
import game.netent.Entity.Round;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game/netjackent")
public class NetJackEntController {

    private final Player player;
    private final NetJackEnt game;

    public NetJackEntController(){
        this.game = new NetJackEnt();
        this.player = new Player();
    }

    @GetMapping(value ="/start", produces = "application/json")
    public String start()  {

        return game.spin(player);
    }


}
