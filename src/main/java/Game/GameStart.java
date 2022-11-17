package Game;

import gui_main.GUI;

public class GameStart {
    private static GameStart single_instance = null;

    public void gamestart(){
        GUI gui = new GUI();
        gui.showMessage("welcome to the game");
        String userbutton = gui.getUserButtonPressed(
                "how many players are in this game?",
                "2", "3", "4"
        );
    }
    public static GameStart getInstance()
    {
        if(single_instance == null)
            single_instance = new GameStart();
        return single_instance;

    }

}
