import Game.Player;
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
        if (PlayerNumber == 2) {
            String Player1Name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(Player1Name, 2000, 0);
            String Player2Name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(Player2Name, 2000, 0);
            Turn1die Player1Tur = new Turn1die();
            Turn1die Player2Tur = new Turn1die();
            GUI_Player PLayer1GUI = new GUI_Player(Player1Name, 2000);
            GUI_Player Player2GUI = new GUI_Player(Player2Name, 2000);
            gui.addPlayer(PLayer1GUI);
            gui.addPlayer(Player2GUI);
            GUI_Field Field = gui.getFields()[0];
            PLayer1GUI.getCar().setPosition(Field);
            Player2GUI.getCar().setPosition(Field);
            while (PLayer1GUI.getBalance() > 0 && Player2GUI.getBalance() > 0) {
                gui.showMessage(Player1Name + " starts");
                int Roll1 = Player1Tur.tur();
                gui.setDie(Roll1);
                gui.showMessage("you've got " + Roll1);
                int PresentFieldPlayer1 = player1.AddToFelt(Roll1);
                gui.showMessage("that means you've move to felt " + player1.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer1];
                PLayer1GUI.getCar().setPosition(Field);
                System.out.println(Field);

                gui.showMessage(Player1Name + " starts");
                int Roll2 = Player2Tur.tur();
                gui.setDie(Roll2);
                gui.showMessage("you've got " + Roll2);
                int PresentFieldPlayer2 = player2.AddToFelt(Roll2);
                gui.showMessage("that means you've move to felt " + player2.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer2];
                Player2GUI.getCar().setPosition(Field);
                System.out.println(Field);
            }
        }
        if (PlayerNumber == 3) {
            String Player1Name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(Player1Name, 1800, 0);
            String Player2Name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(Player2Name, 1800, 0);
            String Player3Name = gui.getUserString("Enter the third players name");
            Player player3 = new Player(Player3Name, 1800, 0);
            Turn1die Player1Tur = new Turn1die();
            Turn1die Player2Tur = new Turn1die();
            Turn1die Player3Tur = new Turn1die();
            GUI_Player PLayer1GUI = new GUI_Player(Player1Name, 1800);
            GUI_Player Player2GUI = new GUI_Player(Player2Name, 1800);
            GUI_Player Player3GUI = new GUI_Player(Player3Name, 1800);
            gui.addPlayer(PLayer1GUI);
            gui.addPlayer(Player2GUI);
            gui.addPlayer(Player3GUI);
            GUI_Field Field = gui.getFields()[0];
            PLayer1GUI.getCar().setPosition(Field);
            Player2GUI.getCar().setPosition(Field);
            Player3GUI.getCar().setPosition(Field);
            while (PLayer1GUI.getBalance() > 0 && Player2GUI.getBalance() > 0 && Player3GUI.getBalance() > 0) {
                gui.showMessage(Player1Name + " starts");
                int Roll1 = Player1Tur.tur();
                gui.setDie(Roll1);
                gui.showMessage("you've got " + Roll1);
                int PresentFieldPlayer1 = player1.AddToFelt(Roll1);
                gui.showMessage("that means you've move to felt " + player1.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer1];
                PLayer1GUI.getCar().setPosition(Field);
                System.out.println(Field);

                gui.showMessage(Player2Name + " starts");
                int Roll2 = Player2Tur.tur();
                gui.setDie(Roll2);
                gui.showMessage("you've got " + Roll2);
                int PresentFieldPlayer2 = player2.AddToFelt(Roll2);
                gui.showMessage("that means you've move to felt " + player2.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer2];
                Player2GUI.getCar().setPosition(Field);
                System.out.println(Field);

                gui.showMessage(Player3Name + " starts");
                int Roll3 = Player3Tur.tur();
                gui.setDie(Roll3);
                gui.showMessage("you've got " + Roll3);
                int PresentFieldPlayer3 = player3.AddToFelt(Roll3);
                gui.showMessage("that means you've move to felt " + player3.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer3];
                Player3GUI.getCar().setPosition(Field);
                System.out.println(Field);

            }
        }
        if (PlayerNumber == 4) {
            String Player1Name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(Player1Name, 1600, 0);
            String Player2Name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(Player2Name, 1600, 0);
            String Player3Name = gui.getUserString("Enter the third players name");
            Player player3 = new Player(Player3Name, 1600, 0);
            String Player4Name = gui.getUserString("Enter the fourth players name");
            Player player4 = new Player(Player4Name, 1600, 0);
            Turn1die Player1Tur = new Turn1die();
            Turn1die Player2Tur = new Turn1die();
            Turn1die Player3Tur = new Turn1die();
            Turn1die Player4Tur = new Turn1die();
            GUI_Player PLayer1GUI = new GUI_Player(Player1Name, 1600);
            GUI_Player Player2GUI = new GUI_Player(Player2Name, 1600);
            GUI_Player Player3GUI = new GUI_Player(Player3Name, 1600);
            GUI_Player Player4GUI = new GUI_Player(Player4Name, 1600);
            gui.addPlayer(PLayer1GUI);
            gui.addPlayer(Player2GUI);
            gui.addPlayer(Player3GUI);
            gui.addPlayer(Player4GUI);
            GUI_Field Field = gui.getFields()[0];
            PLayer1GUI.getCar().setPosition(Field);
            Player2GUI.getCar().setPosition(Field);
            Player3GUI.getCar().setPosition(Field);
            Player4GUI.getCar().setPosition(Field);
            while (PLayer1GUI.getBalance() > 0 && Player2GUI.getBalance() > 0 && Player3GUI.getBalance() > 0 && Player4GUI.getBalance() > 0) {
                gui.showMessage(Player1Name + " starts");
                int Roll1 = Player1Tur.tur();
                gui.setDie(Roll1);
                gui.showMessage("you've got " + Roll1);
                int PresentFieldPlayer1 = player1.AddToFelt(Roll1);
                gui.showMessage("that means you've move to felt " + player1.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer1];
                PLayer1GUI.getCar().setPosition(Field);
                System.out.println(Field);

                gui.showMessage(Player2Name + " starts");
                int Roll2 = Player2Tur.tur();
                gui.setDie(Roll2);
                gui.showMessage("you've got " + Roll2);
                int PresentFieldPlayer2 = player2.AddToFelt(Roll2);
                gui.showMessage("that means you've move to felt " + player2.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer2];
                Player2GUI.getCar().setPosition(Field);
                System.out.println(Field);

                gui.showMessage(Player3Name + " starts");
                int Roll3 = Player3Tur.tur();
                gui.setDie(Roll3);
                gui.showMessage("you've got " + Roll3);
                int PresentFieldPlayer3 = player3.AddToFelt(Roll3);
                gui.showMessage("that means you've move to felt " + player3.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer3];
                Player3GUI.getCar().setPosition(Field);
                System.out.println(Field);

                gui.showMessage(Player3Name + " starts ");
                int Roll4 = Player4Tur.tur();
                gui.setDie(Roll4);
                gui.showMessage("you've git " + Roll4);
                int PresentFieldPlayer4 = player4.AddToFelt(Roll4);
                gui.showMessage("that means you've move to felt " + player4.GetFelt());
                Field = gui.getFields()[PresentFieldPlayer4];
                Player4GUI.getCar().setPosition(Field);
                System.out.println(Field);
            }
        }
    }
}
