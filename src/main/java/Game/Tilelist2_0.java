package Game;

import java.lang.reflect.Type;

public class Tilelist2_0 {
    private Tile2_0 [] liste2_0;
    private static Tilelist2_0 single_instance = null;

    private Tilelist2_0() {
        liste2_0 = new Tile2_0[40];
        int i = 0;
        // Vi har med vilje valgt at skrive [1], [2] osv, istedet for [i++]. Grunden til dette, er for at vi bedre forstår hvilket felt vi skriver om.
        liste2_0[i++] = new Tile2_0("Start",-200,0);
        liste2_0[i++] = new Tile2_0("Ejendom", 60,60);
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 60 , 60);
        liste2_0[i++] = new Tile2_0("Betal indkomstskat", 200 , 0 );
        liste2_0[i++] = new Tile2_0("Øresund", 200 , 200 );
        liste2_0[i++] = new Tile2_0("Ejendom", 100 , 100 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 100 , 100 );
        liste2_0[i++] = new Tile2_0("Ejendom", 120 , 120 );
        liste2_0[i++] = new Tile2_0("Fængsel", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 140 , 140 );
        liste2_0[i++] = new Tile2_0("Tuborg", 150 , 150 );
        liste2_0[i++] = new Tile2_0("Ejendom", 140 , 140 );
        liste2_0[i++] = new Tile2_0("Ejendom", 140 , 140 );
        liste2_0[i++] = new Tile2_0("D.F.D.S", 200 , 200 );
        liste2_0[i++] = new Tile2_0("Ejendom", 180 , 180 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 180 , 180 );
        liste2_0[i++] = new Tile2_0("Ejendom", 180 , 180 );
        liste2_0[i++] = new Tile2_0("Helle", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 220 , 220 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 220 , 220 );
        liste2_0[i++] = new Tile2_0("Ejendom", 240 , 240 );
        liste2_0[i++] = new Tile2_0("Ø.S.", 200 , 200 );
        liste2_0[i++] = new Tile2_0("Ejendom", 260 , 260 );
        liste2_0[i++] = new Tile2_0("Ejendom", 260 , 260 );
        liste2_0[i++] = new Tile2_0("Carlsberg", 150 , 150 );
        liste2_0[i++] = new Tile2_0("Ejendom", 280 , 280);
        liste2_0[i++] = new Tile2_0("Gå i fængsel", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 300 , 300 );
        liste2_0[i++] = new Tile2_0("Ejendom", 300 , 300 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 320 , 320 );
        liste2_0[i++] = new Tile2_0("Bornholm", 200 , 200 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 350 , 350 );
        liste2_0[i++] = new Tile2_0("Statsskat", 100 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 400 , 400 );
    }
    public String getType(int i) {return liste2_0[i].getType();}
    public static Tilelist2_0 getInstance()
    {
        if(single_instance == null)
            single_instance = new Tilelist2_0();
        return single_instance;

    }
}
