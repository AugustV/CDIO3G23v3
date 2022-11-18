package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class GameStart {
    public static GUI gui;
    public static Player[] players;
    public static int playernumber;
    // private static GameStart single_instance = null;



    public GameStart() {

    }



    public  static Player[] gamestart(){


        gui = new GUI();
        gui.showMessage("welcome to the game");
        String userbutton = gui.getUserButtonPressed(
                "how many players are in this game?",
                "2", "3", "4"
        );

        playernumber = Integer.parseInt(userbutton);
        String[] playerNumbers = {"first", "second", "third", "fourth"};

        players = new Player[playernumber];

        for (int i = 0; i < playernumber; i++) {
            String playerName = gui.getUserString("Enter the " +playerNumbers[i]+ "players name");
            GUI_Player playergui = new GUI_Player(playerName, 20);
            Player player = new Player(playerName, 20, 0,playergui);
            // Turn1die player1tur = new Turn1die();
            gui.addPlayer(playergui);
            GUI_Field field = gui.getFields()[0];
            playergui.getCar().setPosition(field);
            players[i] = player;
        }

        gui.showMessage(  "starts");
        return players;
    }

    public static int Getplayernumber(){
        return playernumber;
    }



    /* public static GameStart getInstance()

    {
        if(single_instance == null)
            single_instance = new GameStart();
        return single_instance;

    }
*/
}
