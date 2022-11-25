package Game;
import java.util.Random;
public class CardDraw {
    protected CardDraw() {
    }
    protected static   int drawcard(){
        Random r = new Random();
        int card = r.nextInt(12);
        return card;
    }
}
