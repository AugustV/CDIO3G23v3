import Game.Player;
import Game.Tile2_0;
import Game.Tilelist2_0;
import Game.Turn1die;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.showMessage("welcome to the game");
        String userbutton = gui.getUserButtonPressed(
                "how many players are in this game?",
                "2", "3", "4"
        );
        int PlayerNumber = Integer.parseInt(userbutton);
        if (PlayerNumber == 2){
            String Player1Name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(Player1Name, 20, 0);
            String Player2Name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(Player2Name, 20, 0);
            Turn1die Player1Tur = new Turn1die();
            Turn1die Player2Tur = new Turn1die();
            GUI_Player PLayer1GUI = new GUI_Player( Player1Name, 20);
            GUI_Player Player2GUI = new GUI_Player( Player2Name, 20);
            gui.addPlayer(PLayer1GUI);
            gui.addPlayer(Player2GUI);
            GUI_Field Field = gui.getFields()[0];
            PLayer1GUI.getCar().setPosition(Field);
            Player2GUI.getCar().setPosition(Field);
            gui.showMessage(Player1Name + " starts");
            while (PLayer1GUI.getBalance() > 0 && Player2GUI.getBalance() > 0 ){
                gui.showMessage("it is " + Player1Name + " turn");
                int Roll1 = Player1Tur.tur();
                gui.setDie(Roll1);
                gui.showMessage("you've got " + Roll1);
                int PresentFieldPlayer1 = player1.AddToFelt(Roll1);
                gui.showMessage("that means you've move to felt " + player1.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer1];
                PLayer1GUI.getCar().setPosition(Field);
                gui.showMessage("you've landed on " + Field.getTitle());
                gui.showMessage(Field.getDescription());
                gui.displayChanceCard("hej");
                Tilelist2_0 currentfelt = new Tilelist2_0();
                ;

                if (currentfelt.getType(PresentFieldPlayer1) == "ejendom"){

                }
            }
        }

    }

}
