package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class PlayerTurn extends Game {


    public void playerturn(Player player,Turn1die playerturn, GUI gui) {
        if (player.getFængselstatus()) {
            gui.showMessage(player.toString() + " you're in prison, so you have to wait a round");
            player.setFængselstatusFalse();
        } else {
            gui.showMessage("it is " + player.toString() + " turn");
            int roll1 = playerturn.tur();
            gui.setDie(roll1);
            gui.showMessage("you've got " + roll1);
            int presentfieldplayer1pre = player.AddToFelt(roll1);
            int presentfieldplayer1;
            if (presentfieldplayer1pre > 23) {
                presentfieldplayer1 = presentfieldplayer1pre - 24;
                presentfieldplayer1pre = presentfieldplayer1;
                player.AddToFelt(-24);
                player.AddToSaldo(2);
                player.getGui_player().setBalance(player.GetSaldo());
            } else presentfieldplayer1 = presentfieldplayer1pre;
            gui.showMessage("that means you've move to felt " + player.GetFelt());
            GUI_Field field = gui.getFields()[presentfieldplayer1];
            player.getGui_player().getCar().setPosition(field);
            gui.showMessage("you've landed on " + field.getTitle());
            Tilelist2_0 currentfelt = Tilelist2_0.getInstance();
            System.out.println(currentfelt);
            if (currentfelt.getType(presentfieldplayer1) == "Ejendom") {
                if (currentfelt.getOwnershipStatus(presentfieldplayer1)) {
                    if (currentfelt.getOwner(presentfieldplayer1) == player) {
                        gui.showMessage("you own this place, so you don't have to pay rent");
                    } else {
                        gui.showMessage("you have to pay for rent, because the place is already owned");
                        player.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                        player.getGui_player().setBalance(player.GetSaldo());
                        Player owner = currentfelt.getOwner(presentfieldplayer1);
                        owner.AddToSaldo(currentfelt.getRent(presentfieldplayer1));
                        owner.getGui_player().setBalance(owner.GetSaldo());
                    }
                }
                if (currentfelt.getOwnershipStatus(presentfieldplayer1) == false) {
                    String userbutton = gui.getUserButtonPressed(
                            "do you want to buy the property or do you want to pay for rent?",
                            "buy the property", "pay for rent"
                    );
                    if (userbutton == "buy the property") {
                        player.AddToSaldo(-currentfelt.getSalesprice(presentfieldplayer1));
                        player.getGui_player().setBalance(player.GetSaldo());
                        currentfelt.setOwner(player, presentfieldplayer1);
                        GUI_Ownable ownable = (GUI_Ownable) field;
                        ownable.setOwnerName(player.toString());
                    }
                    if (userbutton == "pay for rent") {
                        player.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                        player.getGui_player().setBalance(player.GetSaldo());
                    }
                }
            }
            if (currentfelt.getType(presentfieldplayer1) == "payment") {
                gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer1));
                player.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));
                player.getGui_player().setBalance(player.GetSaldo());
            }
            if (currentfelt.getType(presentfieldplayer1) == "Betal indkomstskat") {
                String userbutton = gui.getUserButtonPressed(
                        "do you want to pay 10% of your money og 200?",
                        "pay 10%", "pay 200"
                );
                if (userbutton == "pay 10%") {
                    player.AddToSaldo(-(player.GetSaldo() / 10));
                    player.getGui_player().setBalance(player.GetSaldo());
                } else {
                    player.AddToSaldo(-2);
                    player.getGui_player().setBalance(player.GetSaldo());
                }
            }
            if (currentfelt.getType(presentfieldplayer1) == "Fængsel") {
                gui.showMessage("you need to wait a round before you can start again");
                player.setFængselstatusTrue();
            }
        }


    }


}


