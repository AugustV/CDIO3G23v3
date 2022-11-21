package Game;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
public class GameStart {
    public static GUI gui;  //Laver en ny GUI
    public static Player[] players; //Laver en ny Player array
    public static int playernumber; //Laver en ny integer der fortæller hvor mange player der er i spillet
    // private static GameStart single_instance = null;
    public GameStart() {}   //Laver et objekt der hedder GameStart
    public  static Player[] gamestart(){    //laver en player array der hedder gamestart
        gui = new GUI(); //Opretter en ny GUI
        gui.showMessage("welcome to the game"); //printer noget tekst
        String userbutton = gui.getUserButtonPressed(   //laver en knap som brugeren kan trykke på
                "how many players are in this game?",   //printer noget tekst
                "2", "3", "4"   //valgmuligheder af knapper
        );
        playernumber = Integer.parseInt(userbutton);    //laver resultat fra userbutton om til en integer
        String[] playerNumbers = {"first", "second", "third", "fourth"};    //giver playerNumbers en tekst
        players = new Player[playernumber]; //laver x antal players
        for (int i = 0; i < playernumber; i++) {    //laver et for loop der kører hver player gennem
            String playerName = gui.getUserString("Enter the " +playerNumbers[i]+ "players name");  //Laver en String som er playerens navn
            GUI_Player playergui = new GUI_Player(playerName, 20);  //laver en ny GUI player
            Player player = new Player(playerName, 20, 0,playergui);    //laver en ny Player
            // Turn1die player1tur = new Turn1die();
            gui.addPlayer(playergui);   //tilføjer en player til vores GUI
            GUI_Field field = gui.getFields()[0];   //finder et felt frem i GUI'en
            playergui.getCar().setPosition(field);  //sætter vores gui player til et felt
            players[i] = player;    //sætter vores player ind i vores player array
        }
        gui.showMessage(  "starts");    //printer noget tekst
        return players; //returnere players
    }
    public static int Getplayernumber(){    //objekt der returnere hvor mange player der er i spillet
        return playernumber;    //returnere player antal
    }

}
