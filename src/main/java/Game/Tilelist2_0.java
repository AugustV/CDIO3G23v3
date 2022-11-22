package Game;

import java.lang.reflect.Type;

public class Tilelist2_0 {
    private Tile2_0 [] liste2_0;
    private static Tilelist2_0 single_instance = null;
    private Tilelist2_0() { //tilføjer alle vores felter til vores array
        liste2_0 = new Tile2_0[24]; //definere hvor mange felter der i vores array
        int i = 0;  //sætter feltet position i vores array til at starte med at være 0
        // Vi har valgt at skrive [i++] for at gøre kodning hurtigere
        liste2_0[i++] = new Tile2_0("Start",-2,0);
        liste2_0[i++] = new Tile2_0("Ejendom", 1,1);
        liste2_0[i++] = new Tile2_0("Ejendom", 1 , 1 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0);
        liste2_0[i++] = new Tile2_0("Ejendom", 1 , 1 );
        liste2_0[i++] = new Tile2_0("Ejendom", 1 , 1 );
        liste2_0[i++] = new Tile2_0("Fængsel", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Ejendom", 2 , 2 );
        liste2_0[i++] = new Tile2_0("Helle", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Ejendom", 3 , 3 );
        liste2_0[i++] = new Tile2_0("Fængsel", 0 ,     0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 4 , 4 );
        liste2_0[i++] = new Tile2_0("Ejendom", 4 , 4 );
        liste2_0[i++] = new Tile2_0("Prøv lykken", 0 , 0 );
        liste2_0[i++] = new Tile2_0("Ejendom", 5 , 5 );
        liste2_0[i++] = new Tile2_0("Ejendom", 5 , 5 );
    }
    public String getType(int i) {return liste2_0[i].getType();}    //metode til at få typen ud af vores felt
    public Player getOwner(int i) {return liste2_0[i].getOwner();}  //en metode til at få owner af et felt ud
    public boolean getOwnershipStatus(int i) {return liste2_0[i].getOwnershipStatus();} //metode til at få ownershipstatus ud at et felt
    public int getRent(int i) {return liste2_0[i].getRent();}   //en metode til at få huslejen ud af et felt
    public static Tilelist2_0 getInstance() {   //laver en instans af vores array med felter
        if(single_instance == null) //gør så man kun kan lave en instans af vores array
            single_instance = new Tilelist2_0();    //opretter en instans af vores felt
        return single_instance; //returnere instancen
    }
    public int getSalesprice(int i) {return liste2_0[i].getSalesprice();}   // en metode til at få salgsprisen ud af et felt
    public void setOwner(Player newOwner,int i){liste2_0[i].setOwner(newOwner);}    //en metode til at ændre på ejeren af et felt
}
