package lv.tsi.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped //sozdajom sessiju dlja konkretnogo player
@Named
public class PlayerGameContext implements Serializable {
    private player player;
    private lv.tsi.model.game game;

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }

    public void setgame(game game) {
        this.game = game;
    }

    public lv.tsi.model.game getGame() {
        return game;
    }
}
