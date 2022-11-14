import Game.Player;
import Game.Turn1die;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void arrayoverflowtest() {
        String player1name = "Test";

        GUI gui = new GUI();
        GUI_Field field = gui.getFields()[0];
        GUI_Player player1gui = new GUI_Player( player1name, 20000);
        Turn1die player1tur = new Turn1die();
        /*
        This method will test the functions used to move players around them board.
         */
        Player player1 = new Player(player1name, 20000, 0);

        gui.showMessage("it is " + player1name + " turn");
        int roll1 = player1tur.tur();
        gui.setDie(roll1);
        gui.showMessage("you've got " + roll1);
        int presentfieldplayer1pre = player1.AddToFelt(roll1);
        int presentfieldplayer1;
        if (presentfieldplayer1pre > 39){
            presentfieldplayer1 = presentfieldplayer1pre - 40;
            presentfieldplayer1pre = presentfieldplayer1;
            player1.AddToFelt(-40);
        }else presentfieldplayer1 = presentfieldplayer1pre;
        gui.showMessage("that means you've move to felt " + player1.GetFelt());
        field = gui.getFields()[presentfieldplayer1];
        player1gui.getCar().setPosition(field);
        gui.showMessage("you've landed on " + field.getTitle());


    }
}