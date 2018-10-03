package game.netent.Controller;

import game.netent.Entity.Games.NetJackEnt.NetJackEnt;
import game.netent.Entity.Games.NetJackEnt.Rounds.Free;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;
import game.netent.Entity.Player;
import org.json.JSONException;
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
        return game.result(new Normal(player));
    }

    @GetMapping(value = "/freestart",produces = "application/json")
    public String freestart() {
        return game.result(new Free(player));
    }

    @GetMapping(value = "/simulate",produces = "application/json")
    public String simulate(){

            for(int i = 0; i < 10000; i++) {
        new Normal(player);
    }
        return game.result(new Normal(player));
    }

}
