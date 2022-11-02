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

        }

    }
}
