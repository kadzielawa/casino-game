package game.netent.Controller;

import game.netent.Entity.Games.NetJackEnt.NetJackEnt;
import game.netent.Entity.Games.NetJackEnt.Rounds.Free;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game/netjackent")
public class NetJackEntController {

    NetJackEnt game;

    public NetJackEntController(){
        this.game = new NetJackEnt();
    }

    @GetMapping(value ="/start", produces = "application/json")
    public String start(){
        return game.result(new Normal());
    }

    @GetMapping(value = "/freestart",produces = "application/json")
    public String freestart(){
        return game.result(new Free());
    }

}
