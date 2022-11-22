package Game;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;
public class PlayerTurn extends Game {  //laver en classe der hedder playerturn
    /**
     *
     * @param player er vores egen spillerclasse hvor vi har nogen parameter
     * @param playerturn er en hel tur for en spiller
     * @param gui er den gui vi bruger
     */
    public void playerturn(Player player,Turn1die playerturn, GUI gui) {
        if (player.getFængselstatus()) {    //her tjekker vi om spilleren er i fængsel. hvis ja gør den ind i loopet
            gui.showMessage(player.toString() + " you're in prison, so you have to wait a round");  //printer noget tekst
            player.setFængselstatusFalse(); //sætter fængselstatus til false, da spilleren har været i fængsel nu
        } else {
            gui.showMessage("it is " + player.toString() + " turn");    //printer noget tekst
            int roll1 = playerturn.tur();   //ruller en terning
            gui.setDie(roll1);  //viser det på gui'en
            gui.showMessage("you've got " + roll1); //printer noget tekst
            int presentfieldplayer1pre = player.AddToFelt(roll1);   //sætter presenfieldplayerpre til at være lige med det nye punkt spilleren står på
            int presentfieldplayer1;    //laver en presentfieldplayer
            if (presentfieldplayer1pre > 23) {  //siger at hvis det nuværende sted spilleren står er mere end 23 skal den ind i loopet
                presentfieldplayer1 = presentfieldplayer1pre - 24;  //trækker 24 fra det punkt som de står i nu da spilleren skal starte forfra på pladen
                presentfieldplayer1pre = presentfieldplayer1;   //sætter dem begge to til at være lige med hinanden
                player.AddToFelt(-24);  //ændre på playerens felt
                player.AddToSaldo(2);   //tilføjer 2 til saldoen da man får 2 mere hver gang man kommer forbi start
                player.getGui_player().setBalance(player.GetSaldo());   //sætter balancen i gui'en til den nuværende saldo
            } else presentfieldplayer1 = presentfieldplayer1pre;    //går ind i dette loop
            gui.showMessage("that means you've move to felt " + player.GetFelt());  //printer noget tekst
            GUI_Field field = gui.getFields()[presentfieldplayer1]; //får det felt som spilleren lander på
            player.getGui_player().getCar().setPosition(field); //sætter spillerens position til det sted han lander
            gui.showMessage("you've landed on " + field.getTitle());    //printer noget tekst
            Tilelist2_0 currentfelt = Tilelist2_0.getInstance();    //laver en instans af vores tilelist array
            System.out.println(currentfelt);    //printer noget tekst
            if (currentfelt.getType(presentfieldplayer1) == "Ejendom") {    //hvis det felt som spilleren er landet på er en ejendom skal han gå ind her
                if (currentfelt.getOwnershipStatus(presentfieldplayer1)) {  //hvis en spiller ejer det felt skal spilleren ind i dette loop
                    if (currentfelt.getOwner(presentfieldplayer1) == player) {  //hvis spilleren selv ejer dette loop skal spilleren ind i dette loop
                        gui.showMessage("you own this place, so you don't have to pay rent");   //printer noget tekst
                    } else {
                        gui.showMessage("you have to pay for rent, because the place is already owned");    //printer noget tekst
                        player.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));   //fjerner de penge spilleren skal betale for at lande på dette felt
                        player.getGui_player().setBalance(player.GetSaldo());   //ændre balancen i gui'en
                        Player owner = currentfelt.getOwner(presentfieldplayer1);   //får ejeren af feltet ud af currentfelt
                        owner.AddToSaldo(currentfelt.getRent(presentfieldplayer1)); //tilføjer de penge som den anden spiller har betalt
                        owner.getGui_player().setBalance(owner.GetSaldo()); //ændrer ejerens balance
                    }
                }
                if (currentfelt.getOwnershipStatus(presentfieldplayer1) == false) { //hvis der er ingen der ejer ejendommen skal spilleren herind
                    String userbutton = gui.getUserButtonPressed(   //laver et valg spilleren skal tage
                            "do you want to buy the property or do you want to pay for rent?",  //vil ejeren købe ejendommen
                            "buy the property", "pay for rent"  //valgmulighederne
                    );
                    if (userbutton == "buy the property") { //hvis spilleren har valgt at købe ejendommen
                        player.AddToSaldo(-currentfelt.getSalesprice(presentfieldplayer1)); //fjerne pengen fra spillerens konto
                        player.getGui_player().setBalance(player.GetSaldo());   //viser det i gui'en
                        currentfelt.setOwner(player, presentfieldplayer1);  //sætter feltet til at være ejet
                        GUI_Ownable ownable = (GUI_Ownable) field;  //sætter den også til at være ejet i gui'en
                        ownable.setOwnerName(player.toString());    //skriver hvem der ejer feltet
                    }
                    if (userbutton == "pay for rent") { //hvis spilleren har valgt at betale leje
                        player.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));   //trækker pengene fra spillerens konto
                        player.getGui_player().setBalance(player.GetSaldo());   //viser det i gui'en
                    }
                }
            }
            if (currentfelt.getType(presentfieldplayer1) == "payment") {    //hvis feltet spilleren lander på er et payment felt
                gui.showMessage("you have to pay " + currentfelt.getRent(presentfieldplayer1)); //printer noget tekst
                player.AddToSaldo(-currentfelt.getRent(presentfieldplayer1));   //trækker pengene fra spillerens konto
                player.getGui_player().setBalance(player.GetSaldo());   //viser det i gui'en
            }
            if (currentfelt.getType(presentfieldplayer1) == "Betal indkomstskat") { //hvis feltet spilleren lander på er et betal indkomstskat felt
                String userbutton = gui.getUserButtonPressed(   //laver et valg for spilleren
                        "do you want to pay 10% of your money og 2?", //vil spilleren betale 10% eller 2
                        "pay 10%", "pay 2"    //spillerens valg
                );
                if (userbutton == "pay 10%") {  //hvis spilleren har valgt 10%
                    player.AddToSaldo(-(player.GetSaldo() / 10));   //fjerner 10% af hans saldo fra hans konto
                    player.getGui_player().setBalance(player.GetSaldo());   //viser det i gui'en
                } else {    //hvis spilleren gerne vil betale 2
                    player.AddToSaldo(-2);  //trækker 2 fra spillerens saldo
                    player.getGui_player().setBalance(player.GetSaldo());   //viser det i gui'en
                }
            }
            if (currentfelt.getType(presentfieldplayer1) == "Fængsel") {    //hvis spilleren er landet på fængsel
                gui.showMessage("you need to wait a round before you can start again"); //printer noget tekst
                player.setFængselstatusTrue();  //sætter spillerens  fængselstatus til true
            }
            if (currentfelt.getType(presentfieldplayer1)== "Prøv lykken"){
                int card = CardDraw.drawcard();
                gui.showMessage("you draw a random card from the chance card deck");
                gui.showMessage("you've drawn the card  " + Chancecarddeck.getInstance().getText(card));
                player.AddToSaldo(Chancecarddeck.getInstance().getnumber(card));
                player.getGui_player().setBalance(player.GetSaldo());
                System.out.println(Chancecarddeck.getInstance().getnumber(card));

            }
        }
    }
}