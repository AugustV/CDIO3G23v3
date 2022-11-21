package Game;

import Game.*;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;




public class Main {

    public static void main(String[] args) {
        Player[] players =  GameStart.gamestart();
        Game.runGame();
            }
}