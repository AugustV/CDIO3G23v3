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
        int p = Integer.parseInt(userbutton);
        if (p == 2){
            String p1 = gui.getUserString("Enter the first players name");
            String p2 = gui.getUserString("Enter the second players name");
            Turn1die p1tur = new Turn1die();
            Turn1die p2tur = new Turn1die();
            GUI_Player player1 = new GUI_Player( p1, 20);
            GUI_Player player2 = new GUI_Player( p2, 20);
            gui.addPlayer(player1);
            gui.addPlayer(player2);
            GUI_Field field = gui.getFields()[0];
            player1.getCar().setPosition(field);
            player2.getCar().setPosition(field);
            while (player1.getBalance() > 0 && player2.getBalance() > 0 ){
                gui.showMessage(p1 + " starts");
                int r1 = p1tur.tur();
                gui.showMessage("you've got " + r1);
                gui.setDie(r1);
                int fp1 = 0;
                fp1 = fp1 + r1;
                gui.showMessage("that means you've move to felt " + fp1);

            }
        }

    }
}
