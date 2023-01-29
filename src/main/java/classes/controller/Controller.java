package classes.controller;

import classes.player.Player;

import java.util.List;

public class Controller {
    private List<Player> players;

    public Controller(List<Player> players) {
        this.players = players;
    }

    public void letPlayerPlay(Player p) {
        p.rollDice();
    }

    public void resultDisplay() {
        for (int i = 0; i < players.size(); ++i) {
            System.out.println(
                    players.get(i).getName() +
                    " total point: " +
                    players.get(i).getPoint()
            );
        }
    }
}
