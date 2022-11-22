package Game;

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
        int roundsonboard1 = 0;
        int movesmade1 = 0;
        int roundsonboard2 = 0;
        int movesmade2 = 0;
        GUI gui = new GUI();
        GUI_Field field = gui.getFields()[0];
        GUI_Player player1gui = new GUI_Player( player1name, 20000);
        Turn1die player1tur = new Turn1die();
        /*
        This method will test the functions used to move players around them board.
         */
        Player player1 = new Player(player1name, 20000, 0,player1gui);
       // gui.addPlayer(player1gui);
        //player1gui.getCar().setPosition(field);


       // gui.showMessage("it is " + player1name + " turn");
        System.out.println("Test for moving 1 step at a time.");
        for(int i = 0; i < 100000000; i++) {
            int roll1 = 1;
           // gui.setDie(roll1);
          //  gui.showMessage("you've got " + roll1);
            int presentfieldplayer1pre = player1.AddToFelt(roll1);
            int presentfieldplayer1;
            if (presentfieldplayer1pre > 23) {
                presentfieldplayer1 = presentfieldplayer1pre - 24;
                presentfieldplayer1pre = presentfieldplayer1;
                player1.AddToFelt(-24);
                roundsonboard1++;
            } else presentfieldplayer1 = presentfieldplayer1pre;
           // gui.showMessage("that means you've move to felt " + player1.GetFelt());
            field = gui.getFields()[presentfieldplayer1];
            player1gui.getCar().setPosition(field);
            movesmade1++;
         //   gui.showMessage("you've landed on " + field.getTitle());

        }
        System.out.println("how many times the car moved = " + movesmade1);
        System.out.println("how many complete rounds there has been = " + roundsonboard1);

        System.out.println("Test for moving 2 step at a time.");
        for(int  i = 0; i < 100000000; i++) {
            int roll1 = 1;
            // gui.setDie(roll1);
            //  gui.showMessage("you've got " + roll1);
            int presentfieldplayer1pre = player1.AddToFelt(roll1);
            int presentfieldplayer1;
            if (presentfieldplayer1pre > 23) {
                presentfieldplayer1 = presentfieldplayer1pre -24;
                presentfieldplayer1pre = presentfieldplayer1;
                player1.AddToFelt(-24);
                roundsonboard2++;
            } else presentfieldplayer1 = presentfieldplayer1pre;
            // gui.showMessage("that means you've move to felt " + player1.GetFelt());
            field = gui.getFields()[presentfieldplayer1];
            player1gui.getCar().setPosition(field);
            movesmade2++;
            //   gui.showMessage("you've landed on " + field.getTitle());
            // kage
        }
        System.out.println("how many times the car moved = " + movesmade2);
        System.out.println("how many complete rounds there has been = " + roundsonboard2);
    }



}