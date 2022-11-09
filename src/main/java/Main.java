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
        int playernumber = Integer.parseInt(userbutton);
        if (playernumber == 2){
            String player1name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(player1name, 20, 0);
            String player2name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(player2name, 20, 0);
            Turn1die player1tur = new Turn1die();
            Turn1die player2tur = new Turn1die();
            GUI_Player player1gui = new GUI_Player( player1name, 20);
            GUI_Player player2gui = new GUI_Player( player2name, 20);
            gui.addPlayer(player1gui);
            gui.addPlayer(player2gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);
            gui.showMessage(player1name + " starts");
            while (player1gui.getBalance() > 0 && player2gui.getBalance() > 0 ){
                gui.showMessage("it is " + player1name + " turn");
                int roll1 = 1; //player1tur.tur();
                gui.setDie(roll1);
                gui.showMessage("you've got " + roll1);
                int presentfieldplayer1 = player1.AddToFelt(roll1);
                gui.showMessage("that means you've move to felt " + player1.GetFelt());
                field = gui.getFields()[presentfieldplayer1];
                player1gui.getCar().setPosition(field);
                gui.showMessage("you've landed on " + field.getTitle());
                Tilelist2_0 currentfelt = Tilelist2_0.getInstance();

              System.out.println(currentfelt);
                if (currentfelt.getType(presentfieldplayer1) == "Ejendom"){
                    if (currentfelt.getOwnershipStatus(presentfieldplayer1) == false){
                        gui.showMessage("you have to pay for rent, because the place is already owned");
                        player1.AddToSaldo(currentfelt.getRent(presentfieldplayer1));
                    }

                }
            }
        }

    }

}
