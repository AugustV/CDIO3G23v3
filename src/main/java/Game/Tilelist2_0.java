package Game;

import java.lang.reflect.Type;

public class Tilelist2_0 {
    private Tile2_0 [] liste2_0;

    public Tilelist2_0() {
        liste2_0 = new Tile2_0[40];
        int i = 0;
        liste2_0[i++] = new Tile2_0("start",-200,0);
        liste2_0[i++] = new Tile2_0("ejendom", 0,60);


    }
    public String getType(int i) {return liste2_0[i].getType();}

}
