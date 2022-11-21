package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import org.sonatype.guice.plexus.binders.PlexusAnnotatedBeanModule;

class Game {
    private static Player[] players;
/*
    public Game(Player[] players) {
        this.players = players;
    }


 */
    public static void runGame() {
        GUI gui = GameStart.gui;
        players = GameStart.players;
        boolean gameOver = false;
        PlayerTurn playerTurn = new PlayerTurn();
        Turn1die die = new Turn1die();
        do {
            for (Player player : players) {
                playerTurn.playerturn(player, die, gui);
                if(player.GetSaldo() <= 0) {
                    gameOver =true;
                    break;
                }
            }
        } while(gameOver == false);
    }

}
