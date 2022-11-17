package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;

public class PlayerTurn {
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
            gui.showMessage(player1name + " starts");


    public void playerturn(){

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

        Tilelist2_0 currentfelt = Tilelist2_0.getInstance();

        System.out.println(currentfelt);
    }



}
