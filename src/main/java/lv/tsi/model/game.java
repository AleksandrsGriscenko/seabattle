package lv.tsi.model;

public class game {
    private player player1;
    private player player2;


    public boolean isComplete(){
        return player1 != null && player2 != null;
    }

    public player getPlayer1() {
        return player1;
    }

    public void setPlayer1(player player1) {
        this.player1 = player1;
    }

    public player getPlayer2() {
        return player2;
    }

    public void setPlayer2(player plaer2) {
        this.player2 = plaer2;
    }

}
