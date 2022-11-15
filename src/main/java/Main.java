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
            gui.addPlayer(player1gui);
            gui.addPlayer(player2gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);
            gui.showMessage(player1name + " starts");
            while (player1gui.getBalance() > 0 && player2gui.getBalance() > 0 ){
                if (player1.getFængselstatus() == true){
                    gui.showMessage(player1name + " you're in prison, so you have to wait a round");
                    player1.setFængselstatusFalse();
                }
                if (player1.getFængselstatus() == false){
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
                    }
                    else presentfieldplayer1 = presentfieldplayer1pre;
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
                                player2.AddToSaldo(currentfelt.getRent(presentfieldplayer1));
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
                    if (currentfelt.getType(presentfieldplayer1) == "Fængsel"){
                        gui.showMessage("you need to wait a round before you can start again");
                        player1.setFængselstatusTrue();
                    }
                }
                if (player2.getFængselstatus() == true){
                    gui.showMessage(player2name + " you're in prison, so you have to wait a round");
                    player2.setFængselstatusFalse();
                }
                if (player2.getFængselstatus() == false){
                    gui.showMessage("it is " + player2name + " turn");
                    int roll2 = player2tur.tur();
                    gui.setDie(roll2);
                    gui.showMessage("you've got " + roll2);
                    int presentfieldplayer2pre = player2.AddToFelt(roll2);
                    int presentfieldplayer2;
                    if (presentfieldplayer2pre > 39){
                        presentfieldplayer2 = presentfieldplayer2pre - 40;
                        presentfieldplayer2pre = presentfieldplayer2;
                        player2.AddToFelt(-40);
                    }
                    else presentfieldplayer2 = presentfieldplayer2pre;
                    gui.showMessage("that means you've move to felt " + player2.GetFelt());
                    field = gui.getFields()[presentfieldplayer2];
                    player2gui.getCar().setPosition(field);
                    gui.showMessage("you've landed on " + field.getTitle());
                    Tilelist2_0 currentfelt = Tilelist2_0.getInstance();
                    System.out.println(currentfelt);
                    if (currentfelt.getType(presentfieldplayer2) == "Ejendom"){
                        if (currentfelt.getOwnershipStatus(presentfieldplayer2)){
                            if (currentfelt.getOwner(presentfieldplayer2) == player2name){
                                gui.showMessage("you own this place, so you don't have to pay rent");
                            }
                            else {
                                gui.showMessage("you have to pay for rent, because the place is already owned");
                                player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                                player1.AddToSaldo(currentfelt.getRent(presentfieldplayer2));
                            }
                            if (currentfelt.getOwner(presentfieldplayer2) == player2name){
                                gui.showMessage("you own this place, so you don't have to pay rent");
                            }
                            else {
                                gui.showMessage("you have to pay for rent, because the place is already owned");
                                player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                            }
                        }
                        if (currentfelt.getOwnershipStatus(presentfieldplayer2) == false){
                            userbutton = gui.getUserButtonPressed(
                                    "do you want to buy the property or do you want to pay for rent?",
                                    "buy the property", "pay for rent"
                            );
                            if (userbutton == "buy the property"){
                                player2.AddToSaldo(-currentfelt.getSalesprice(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                                currentfelt.setOwner(player2name,presentfieldplayer2);
                                GUI_Ownable ownable = (GUI_Ownable) field;
                                ownable.setOwnerName(player2name);
                            }
                            if (userbutton == "pay for rent"){
                                player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                            }
                        }
                    }
                    if (currentfelt.getType(presentfieldplayer2) == "payment"){
                        gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer2));
                        player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                        player2gui.setBalance(player2.GetSaldo());
                    }
                    if (currentfelt.getType(presentfieldplayer2) == "Betal indkomstskat"){
                        userbutton = gui.getUserButtonPressed(
                                "do you want to pay 10% of your money og 200?",
                                "pay 10%", "pay 200"
                        );
                        if (userbutton == "pay 10%"){
                            player2.AddToSaldo(-(player2.GetSaldo()/10));
                            player2gui.setBalance(player2.GetSaldo());
                        }
                        else {
                            player2.AddToSaldo(-200);
                            player2gui.setBalance(player2.GetSaldo());
                        }
                    }
                    if (currentfelt.getType(presentfieldplayer2) == "fængsel"){
                        gui.showMessage("you need to wait a round before you can start again");
                        player2.setFængselstatusTrue();
                    }

                }
            }

        }
        if (playernumber == 3){
            String player1name = "";
            player1name = gui.getUserString("Enter the first players name");
            Player player1 = new Player(player1name, 20000, 0);
            String player2name = gui.getUserString("Enter the second players name");
            Player player2 = new Player(player2name, 20000, 0);
            String player3name = gui.getUserString("Enter the first players name");
            Player player3 = new Player(player3name, 20000, 0);
            Turn1die player1tur = new Turn1die();
            Turn1die player2tur = new Turn1die();
            Turn1die player3tur = new Turn1die();
            GUI_Player player1gui = new GUI_Player( player1name, 20000);
            GUI_Player player2gui = new GUI_Player( player2name, 20000);
            GUI_Player player3gui = new GUI_Player( player3name, 20000);
            gui.addPlayer(player1gui);
            gui.addPlayer(player2gui);
            gui.addPlayer(player3gui);
            GUI_Field field = gui.getFields()[0];
            player1gui.getCar().setPosition(field);
            player2gui.getCar().setPosition(field);
            player3gui.getCar().setPosition(field);
            gui.showMessage(player1name + " starts");
            while (player1gui.getBalance() > 0 && player2gui.getBalance() > 0 && player3gui.getBalance() > 0 ){
                if (player1.getFængselstatus() == true){
                    gui.showMessage(player1name + " you're in prison, so you have to wait a round");
                    player1.setFængselstatusFalse();
                }
                if (player1.getFængselstatus() == false){
                    gui.showMessage("it is " + player1name + " turn");
                    int roll1 = 10; //player1tur.tur();
                    gui.setDie(roll1);
                    gui.showMessage("you've got " + roll1);
                    int presentfieldplayer1pre = player1.AddToFelt(roll1);
                    int presentfieldplayer1;
                    if (presentfieldplayer1pre > 39){
                        presentfieldplayer1 = presentfieldplayer1pre - 40;
                        presentfieldplayer1pre = presentfieldplayer1;
                        player1.AddToFelt(-40);
                    }
                    else presentfieldplayer1 = presentfieldplayer1pre;
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
                                if (currentfelt.getOwner(presentfieldplayer1) == player2name){
                                    player2.AddToSaldo(currentfelt.getRent(presentfieldplayer1));
                                }
                                else
                                    player3.AddToSaldo(currentfelt.getRent(presentfieldplayer1));

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
                        player1.setFængselstatusTrue();
                    }
                }
                if (player2.getFængselstatus() == true){
                    gui.showMessage(player2name + " you're in prison, so you have to wait a round");
                    player2.setFængselstatusFalse();
                }
                if (player2.getFængselstatus() == false){
                    gui.showMessage("it is " + player2name + " turn");
                    int roll2 = player2tur.tur();
                    gui.setDie(roll2);
                    gui.showMessage("you've got " + roll2);
                    int presentfieldplayer2pre = player2.AddToFelt(roll2);
                    int presentfieldplayer2;
                    if (presentfieldplayer2pre > 39){
                        presentfieldplayer2 = presentfieldplayer2pre - 40;
                        presentfieldplayer2pre = presentfieldplayer2;
                        player2.AddToFelt(-40);
                    }
                    else presentfieldplayer2 = presentfieldplayer2pre;
                    gui.showMessage("that means you've move to felt " + player2.GetFelt());
                    field = gui.getFields()[presentfieldplayer2];
                    player2gui.getCar().setPosition(field);
                    gui.showMessage("you've landed on " + field.getTitle());
                    Tilelist2_0 currentfelt = Tilelist2_0.getInstance();
                    System.out.println(currentfelt);
                    if (currentfelt.getType(presentfieldplayer2) == "Ejendom"){
                        if (currentfelt.getOwnershipStatus(presentfieldplayer2)){
                            if (currentfelt.getOwner(presentfieldplayer2) == player2name){
                                gui.showMessage("you own this place, so you don't have to pay rent");
                            }
                            else {
                                gui.showMessage("you have to pay for rent, because the place is already owned");
                                player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                                if (currentfelt.getOwner(presentfieldplayer2) == player1name){
                                    player1.AddToSaldo(currentfelt.getRent(presentfieldplayer2));
                                }
                                else
                                    player3.AddToSaldo(currentfelt.getRent(presentfieldplayer2));
                            }
                            if (currentfelt.getOwner(presentfieldplayer2) == player2name){
                                gui.showMessage("you own this place, so you don't have to pay rent");
                            }
                            else {
                                gui.showMessage("you have to pay for rent, because the place is already owned");
                                player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                            }
                        }
                        if (currentfelt.getOwnershipStatus(presentfieldplayer2) == false){
                            userbutton = gui.getUserButtonPressed(
                                    "do you want to buy the property or do you want to pay for rent?",
                                    "buy the property", "pay for rent"
                            );
                            if (userbutton == "buy the property"){
                                player2.AddToSaldo(-currentfelt.getSalesprice(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                                currentfelt.setOwner(player2name,presentfieldplayer2);
                                GUI_Ownable ownable = (GUI_Ownable) field;
                                ownable.setOwnerName(player2name);
                            }
                            if (userbutton == "pay for rent"){
                                player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                                player2gui.setBalance(player2.GetSaldo());
                            }
                        }
                    }
                    if (currentfelt.getType(presentfieldplayer2) == "payment"){
                        gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer2));
                        player2.AddToSaldo(-currentfelt.getRent(presentfieldplayer2));
                        player2gui.setBalance(player2.GetSaldo());
                    }
                    if (currentfelt.getType(presentfieldplayer2) == "Betal indkomstskat"){
                        userbutton = gui.getUserButtonPressed(
                                "do you want to pay 10% of your money og 200?",
                                "pay 10%", "pay 200"
                        );
                        if (userbutton == "pay 10%"){
                            player2.AddToSaldo(-(player2.GetSaldo()/10));
                            player2gui.setBalance(player2.GetSaldo());
                        }
                        else {
                            player2.AddToSaldo(-200);
                            player2gui.setBalance(player2.GetSaldo());
                        }
                    }
                    if (currentfelt.getType(presentfieldplayer2) == "fængsel"){
                        gui.showMessage("you need to wait a round before you can start again");
                        player2.setFængselstatusTrue();
                    }

                }
                if (player3.getFængselstatus() == true){
                    gui.showMessage(player3name + " you're in prison, so you have to wait a round");
                    player3.setFængselstatusFalse();
                }
                if (player3.getFængselstatus() == false){
                    gui.showMessage("it is " + player2name + " turn");
                    int roll3 = player2tur.tur();
                    gui.setDie(roll3);
                    gui.showMessage("you've got " + roll3);
                    int presentfieldplayer3pre = player3.AddToFelt(roll3);
                    int presentfieldplayer3;
                    if (presentfieldplayer3pre > 39){
                        presentfieldplayer3 = presentfieldplayer3pre - 40;
                        presentfieldplayer3pre = presentfieldplayer3;
                        player3.AddToFelt(-40);
                    }
                    else presentfieldplayer3 = presentfieldplayer3pre;
                    gui.showMessage("that means you've move to felt " + player2.GetFelt());
                    field = gui.getFields()[presentfieldplayer3];
                    player3gui.getCar().setPosition(field);
                    gui.showMessage("you've landed on " + field.getTitle());
                    Tilelist2_0 currentfelt = Tilelist2_0.getInstance();
                    System.out.println(currentfelt);
                    if (currentfelt.getType(presentfieldplayer3) == "Ejendom"){
                        if (currentfelt.getOwnershipStatus(presentfieldplayer3)){
                            if (currentfelt.getOwner(presentfieldplayer3) == player3name){
                                gui.showMessage("you own this place, so you don't have to pay rent");
                            }
                            else {
                                gui.showMessage("you have to pay for rent, because the place is already owned");
                                player3.AddToSaldo(-currentfelt.getRent(presentfieldplayer3));
                                player3gui.setBalance(player3.GetSaldo());
                                if (currentfelt.getOwner(presentfieldplayer3) == player1name){
                                    player1.AddToSaldo(currentfelt.getRent(presentfieldplayer3));
                                }
                                else
                                    player2.AddToSaldo(currentfelt.getRent(presentfieldplayer3));
                            }
                            if (currentfelt.getOwner(presentfieldplayer3) == player3name){
                                gui.showMessage("you own this place, so you don't have to pay rent");
                            }
                            else {
                                gui.showMessage("you have to pay for rent, because the place is already owned");
                                player3.AddToSaldo(-currentfelt.getRent(presentfieldplayer3));
                                player3gui.setBalance(player3.GetSaldo());
                            }
                        }
                        if (currentfelt.getOwnershipStatus(presentfieldplayer3) == false){
                            userbutton = gui.getUserButtonPressed(
                                    "do you want to buy the property or do you want to pay for rent?",
                                    "buy the property", "pay for rent"
                            );
                            if (userbutton == "buy the property"){
                                player3.AddToSaldo(-currentfelt.getSalesprice(presentfieldplayer3));
                                player3gui.setBalance(player3.GetSaldo());
                                currentfelt.setOwner(player3name,presentfieldplayer3);
                                GUI_Ownable ownable = (GUI_Ownable) field;
                                ownable.setOwnerName(player3name);
                            }
                            if (userbutton == "pay for rent"){
                                player3.AddToSaldo(-currentfelt.getRent(presentfieldplayer3));
                                player3gui.setBalance(player3.GetSaldo());
                            }
                        }
                    }
                    if (currentfelt.getType(presentfieldplayer3) == "payment"){
                        gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer3));
                        player3.AddToSaldo(-currentfelt.getRent(presentfieldplayer3));
                        player3gui.setBalance(player3.GetSaldo());
                    }
                    if (currentfelt.getType(presentfieldplayer3) == "Betal indkomstskat"){
                        userbutton = gui.getUserButtonPressed(
                                "do you want to pay 10% of your money og 200?",
                                "pay 10%", "pay 200"
                        );
                        if (userbutton == "pay 10%"){
                            player3.AddToSaldo(-(player3.GetSaldo()/10));
                            player3gui.setBalance(player3.GetSaldo());
                        }
                        else {
                            player3.AddToSaldo(-200);
                            player3gui.setBalance(player3.GetSaldo());
                        }
                    }
                    if (currentfelt.getType(presentfieldplayer3) == "fængsel"){
                        gui.showMessage("you need to wait a round before you can start again");
                        player3.setFængselstatusTrue();
                    }

                }
            }

        }

    }

}
