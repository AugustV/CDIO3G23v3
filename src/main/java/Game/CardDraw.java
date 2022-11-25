package Game;
import java.util.Random;
public class CardDraw {
    protected CardDraw() {
    }
    protected static   int drawcard(){
        /*
        Denne metode er protected dette er fordi der ikke er brug for at Classer ude fra game package intereger med den
        Den gør brug af Random metoden fra java.util og bruger denne til at generer et tal fra 0-11 som svarer til
        længden af arrayen Chancecarddeck
        Derefter returnerer den  int card til brug i PlayerTurn.
         */


        Random r = new Random();
        int card = r.nextInt(12);
        return card;
    }
}
