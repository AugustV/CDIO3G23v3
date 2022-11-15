import Game.Player;
import Game.Tile2_0;
import Game.Tilelist2_0;
import Game.Turn1die;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
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
            Player player1 = new Player(player1name, 20000, 0);
            String player2name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(player2name, 20000, 0);
            Turn1die player1tur = new Turn1die();
            Turn1die player2tur = new Turn1die();
            GUI_Player player1gui = new GUI_Player( player1name, 20000);
            GUI_Player player2gui = new GUI_Player( player2name, 20000);

            gui.addPlayer(player2gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);
            gui.showMessage(player1name + " starts");
            while (player1gui.getBalance() > 0 && player2gui.getBalance() > 0 ){
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
                if (currentfelt.getType(presentfieldplayer1) == "Ejendom"){
                    if (currentfelt.getOwnershipStatus(presentfieldplayer1)){
                        if (currentfelt.getOwner(presentfieldplayer1) == player1name){
                            gui.showMessage("you own this place, so you don't have to pay rent");
                        }
                        else {
                            gui.showMessage("you have to pay for rent, because the place is already owned");
                            player1.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                            player1gui.setBalance(player1.GetSaldo());
                        }
                        if (currentfelt.getOwner(presentfieldplayer1) == player1name){
                            gui.showMessage("you own this place, so you don't have to pay rent");
                        }
                        else {
                            gui.showMessage("you have to pay for rent, because the place is already owned");
                            player1.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                            player1gui.setBalance(player1.GetSaldo());
                        }
                    }
                    if (currentfelt.getOwnershipStatus(presentfieldplayer1) == false){
                        userbutton = gui.getUserButtonPressed(
                                "do you want to buy the property or do you want to pay for rent?",
                                "buy the property", "pay for rent"
                        );
                        if (userbutton == "buy the property"){
                            player1.AddToSaldo(-currentfelt.getSalesprice(presentfieldplayer1));
                            player1gui.setBalance(player1.GetSaldo());
                            currentfelt.setOwner(player1name,presentfieldplayer1);
                            GUI_Ownable ownable = (GUI_Ownable) field;
                            ownable.setOwnerName(player1name);
                        }
                        if (userbutton == "pay for rent"){
                            player1.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                            player1gui.setBalance(player1.GetSaldo());
                        }
                    }

                }
                if (currentfelt.getType(presentfieldplayer1) == "payment"){
                    gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer1));
                    player1.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                    player1gui.setBalance(player1.GetSaldo());
                }
                if (currentfelt.getType(presentfieldplayer1) == "Betal indkomstskat"){
                    userbutton = gui.getUserButtonPressed(
                            "do you want to pay 10% of your money og 200?",
                            "pay 10%", "pay 200"
                    );
                    if (userbutton == "pay 10%"){
                        player1.AddToSaldo(-(player1.GetSaldo()/10));
                        player1gui.setBalance(player1.GetSaldo());
                    }
                    else {
                        player1.AddToSaldo(-200);
                        player1gui.setBalance(player1.GetSaldo());
                    }
                }
                if (currentfelt.getType(presentfieldplayer1) == "fængsel"){
                    gui.showMessage("you need to wait a round before you can start again");

                }
                if (currentfelt.getType(presentfieldplayer1) == "payment"){
                    gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer1));
                    player1.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                    player1gui.setBalance(player1.GetSaldo());
                }
                if (currentfelt.getType(presentfieldplayer1) == "Betal indkomstskat"){
                    userbutton = gui.getUserButtonPressed(
                            "do you want to pay 10% of your money og 200?",
                            "pay 10%", "pay 200"
                    );
                    if (userbutton == "pay 10%"){
                        player1.AddToSaldo(-(player1.GetSaldo()/10));
                        player1gui.setBalance(player1.GetSaldo());
                    }
                    else {
                        player1.AddToSaldo(-200);
                        player1gui.setBalance(player1.GetSaldo());
                    }
                }
            }
        }

    }

}
