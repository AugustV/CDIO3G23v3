package Game;

import java.lang.reflect.Type;

public class Tilelist2_0 {
    private Tile2_0 [] liste2_0;
    private static Tilelist2_0 single_instance = null;

    private Tilelist2_0() {
        liste2_0 = new Tile2_0[24];
        int i = 0;
        // Vi har valgt at skrive [i++] for at gøre kodning hurtigere
        liste2_0[i++] = new Tile2_0("Start",-2,0);
        liste2_0[i++] = new Tile2_0("Ejendom", 1,1);
        liste2_0[i++] = new Tile2_0("Ejendom", 1 , 1 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0); //3
        liste2_0[i++] = new Tile2_0("Ejendom", 1 , 1 );
        liste2_0[i++] = new Tile2_0("Ejendom", 1 , 1 );
        liste2_0[i++] = new Tile2_0("Fængsel", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 ); //9
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Helle", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 ); //15
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Fængsel", 0 ,     0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 4 , 4 );
        liste2_0[i++] = new Tile2_0("Ejendom", 4 , 4 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 ); //21
        liste2_0[i++] = new Tile2_0("Ejendom", 5 , 5 );
        liste2_0[i++] = new Tile2_0("Ejendom", 5 , 5 );
    }
    public String getType(int i) {return liste2_0[i].getType();}
    public Player getOwner(int i) {return liste2_0[i].getOwner();}
    public boolean getOwnershipStatus(int i) {return liste2_0[i].getOwnershipStatus();}
    public int getRent(int i) {return liste2_0[i].getRent();}
    public static Tilelist2_0 getInstance()
    {
        if(single_instance == null)
            single_instance = new Tilelist2_0();
        return single_instance;

    }
    public void setOwner(String newOwner){
        
    }
    public int getSalesprice(int i) {return liste2_0[i].getSalesprice();}

    public void setOwner(Player newOwner,int i){liste2_0[i].setOwner(newOwner);}

}
