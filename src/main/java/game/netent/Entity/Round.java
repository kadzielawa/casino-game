package game.netent.Entity;

import game.netent.Entity.Games.NetJackEnt.Rounds.Free;
import game.netent.Entity.Games.NetJackEnt.Rounds.Normal;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Random;

public abstract class Round {

    public Player player;

    private String type;

    public boolean lost;

    public boolean win;

    public int freeRounds;

    public String getType() {
        return type;
    }

    public Round(Player player){
        this.player = player;
    }


}
