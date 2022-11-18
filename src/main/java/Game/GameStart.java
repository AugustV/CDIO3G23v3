package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class GameStart {
    private static int playernumber;
    // private static GameStart single_instance = null;



    public GameStart() {
    }

    public  static void gamestart(){


        GUI gui = new GUI();
        gui.showMessage("welcome to the game");
        String userbutton = gui.getUserButtonPressed(
                "how many players are in this game?",
                "2", "3", "4"
        );

          playernumber = Integer.parseInt(userbutton);


        if(playernumber==2){
            String player1name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(player1name, 20, 0);
            String player2name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(player2name, 20, 0);
            Turn1die player1tur = new Turn1die();
            Turn1die player2tur = new Turn1die();
            GUI_Player player1gui = new GUI_Player(player1name, 20);
            GUI_Player player2gui = new GUI_Player(player2name, 20);
            gui.addPlayer(player1gui);
            gui.addPlayer(player2gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);

        }
        if(playernumber==3){
            String player1name = "";
            player1name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(player1name, 18, 0);
            String player2name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(player2name, 18, 0);
            String player3name = gui.getUserString("Enter the first players name");
            Player player3 = new Player(player3name, 18, 0);
            Turn1die player1tur = new Turn1die();
            Turn1die player2tur = new Turn1die();
            Turn1die player3tur = new Turn1die();
            GUI_Player player1gui = new GUI_Player(player1name, 18);
            GUI_Player player2gui = new GUI_Player(player2name, 18);
            GUI_Player player3gui = new GUI_Player(player3name, 18);
            gui.addPlayer(player1gui);
            gui.addPlayer(player2gui);
            gui.addPlayer(player3gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);
            player3gui.getCar().setPosition(field);

        }
        if(playernumber == 4 ){
            String player1name = "";
            player1name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(player1name, 16, 0);
            String player2name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(player2name, 16, 0);
            String player3name = gui.getUserString("Enter the third players name");
            Player player3 = new Player(player3name, 16, 0);
            String player4name = gui.getUserString("Enter fourth players name");
            Player player4 = new Player(player4name, 16, 0);
            Turn1die player1tur = new Turn1die();
            Turn1die player2tur = new Turn1die();
            Turn1die player3tur = new Turn1die();
            Turn1die player4tur = new Turn1die();
            GUI_Player player1gui = new GUI_Player(player1name, 16);
            GUI_Player player2gui = new GUI_Player(player2name, 16);
            GUI_Player player3gui = new GUI_Player(player3name, 16);
            GUI_Player player4gui = new GUI_Player(player4name, 16);
            gui.addPlayer(player1gui);
            gui.addPlayer(player2gui);
            gui.addPlayer(player3gui);
            gui.addPlayer(player4gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);
            player3gui.getCar().setPosition(field);
            player4gui.getCar().setPosition(field);
        }


        gui.showMessage(  "starts");
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
