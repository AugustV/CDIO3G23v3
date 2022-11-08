package Game;

import java.lang.reflect.Type;

public class Tilelist2_0 {
    private Tile2_0 [] liste2_0;

    public Tilelist2_0() {
        liste2_0 = new Tile2_0[40];
        int i = 0;
        liste2_0[1] = new Tile2_0("Start",-200,0);
        liste2_0[2] = new Tile2_0("Ejendom", 60,60);
        liste2_0[3] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[4] = new Tile2_0("Ejendom", 60 , 60);
        liste2_0[5] = new Tile2_0("Betal indkomstskat", 200 , 0 );
        liste2_0[6] = new Tile2_0("Øresund", 200 , 200 );
        liste2_0[7] = new Tile2_0("Ejendom", 100 , 100 );
        liste2_0[8] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[9] = new Tile2_0("Ejendom", 100 , 100 );
        liste2_0[10] = new Tile2_0("Ejendom", 120 , 120 );
        liste2_0[11] = new Tile2_0("Fængsel", 0 , 0 );
        liste2_0[12] = new Tile2_0("Ejendom", 140 , 140 );
        liste2_0[13] = new Tile2_0("Tuborg", 150 , 150 );
        liste2_0[14] = new Tile2_0("Ejendom", 140 , 140 );
        liste2_0[15] = new Tile2_0("Ejendom", 140 , 140 );
        liste2_0[16] = new Tile2_0("D.F.D.S", 200 , 200 );
        liste2_0[17] = new Tile2_0("Ejendom", 180 , 180 );
        liste2_0[18] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[19] = new Tile2_0("Ejendom", 180 , 180 );
        liste2_0[20] = new Tile2_0("Ejendom", 180 , 180 );
        liste2_0[21] = new Tile2_0("Helle", 0 , 0 );
        liste2_0[22] = new Tile2_0("Ejendom", 220 , 220 );
        liste2_0[23] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[24] = new Tile2_0("Ejendom", 220 , 220 );
        liste2_0[25] = new Tile2_0("Ejendom", 240 , 240 );
        liste2_0[26] = new Tile2_0("Ø.S.", 200 , 200 );
        liste2_0[27] = new Tile2_0("Ejendom", 260 , 260 );
        liste2_0[28] = new Tile2_0("Ejendom", 260 , 260 );
        liste2_0[29] = new Tile2_0("Carlsberg", 150 , 150 );
        liste2_0[30] = new Tile2_0("Ejendom", 280 , 280);
        liste2_0[31] = new Tile2_0("Gå i fængsel", 0 , 0 );
        liste2_0[32] = new Tile2_0("Ejendom", 300 , 300 );
        liste2_0[33] = new Tile2_0("Ejendom", 300 , 300 );
        liste2_0[34] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[35] = new Tile2_0("Ejendom", 320 , 320 );
        liste2_0[36] = new Tile2_0("Bornholm", 200 , 200 );
        liste2_0[37] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[38] = new Tile2_0("Ejendom", 350 , 350 );
        liste2_0[39] = new Tile2_0("Statsskat", 100 , 0 );
        liste2_0[40] = new Tile2_0("Ejendom", 400 , 400 );
    }
    public String getType(int i) {return liste2_0[i].getType();}

}
