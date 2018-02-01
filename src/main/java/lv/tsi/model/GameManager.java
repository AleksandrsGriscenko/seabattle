package lv.tsi.model;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameManager {
    private game incomplet;

    public game register(player player){
        if (incomplet == null){
            incomplet = new game();
            incomplet.setPlayer1(player);
            return incomplet;
        }else {
            incomplet.setPlayer2(player);
            game tmp = incomplet;
            incomplet = null;
            return tmp;

        }
    }
}
