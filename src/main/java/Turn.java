import Game.Player;
import Game.Turn1die;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Turn {


    Turn1die Player1Tur = new Turn1die();

    GUI gui = new GUI(String Player1Name);
    String Player1Name = gui.getUserString("Enter the first players name");
    GUI_Player PLayer1GUI = new GUI_Player( Player1Name, 20);
    Player player1 = new Player(Player1Name, 20, 0);
    GUI_Field Field = gui.getFields()[0];
    public void turnp1(){
        gui.showMessage(Player1Name + " starts");
        int Roll1 = Player1Tur.tur();
        gui.setDie(Roll1);
        gui.showMessage("you've got " + Roll1);
        int PresentFieldPlayer1 = player1.AddToFelt(Roll1);
        gui.showMessage("that means you've move to felt " + player1.GetFelt());
        Field = gui.getFields()[PresentFieldPlayer1];
        PLayer1GUI.getCar().setPosition(Field);
        System.out.println(Field);

    }


}
