package Game;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import org.sonatype.guice.plexus.binders.PlexusAnnotatedBeanModule;
class Game {
    private static Player[] players; //laver et player array ud fra hvor mange spillere der er i spillet

    public static void runGame() {  //kører spillet
        GUI gui = GameStart.gui;    //laver en gui ud fra gamestart
        players = GameStart.players;    //sætter vores array players lige med gamestarts array players
        boolean gameOver = false;   //sætter gameover til false til at starte med da ingen har tabt i starten af spillet
        PlayerTurn playerTurn = new PlayerTurn();   //opretter en player turn
        Turn1die die = new Turn1die();  //laver en tur med 1 terning
        do {    //så længe gameover er false køre den i loop
            for (Player player : players) { //
                playerTurn.playerturn(player, die, gui);    //
                if(player.GetSaldo() <= 0) {    //fortæller hvis playerens saldo er 0 eller mindre skal den ind i loopet
                    gameOver =true; //ændre boolean gameover til true da en har tabt
                    break;  //spillet skal stoppe
                }
            }
        } while(gameOver == false); //køre do loopet mens gameover er false
        for(Player player : players){
            System.out.println(player.GetSaldo());

        }
        Player winner = players[0];
        for (Player player : players) {

            if (player.GetSaldo() > winner.GetSaldo()) {
                winner = player;
            }
        }
       gui.showMessage(winner.toString() + "has won the game ");

        System.out.println(winner.toString() + " has won the game!" );
        System.out.println("Congratulation to the winner");
        System.out.println("And thank you for playing");

    }

}
