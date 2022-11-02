package Game;

public class TileList {


    private Tile [] liste;



    public TileList() {
        Language lang = new Language();
/**
 * We have decided to do as following, if you wish to change the language of the game, you simply just have to change it in the class "Language"
 * We have done it the way, where we refer to the class "Language" into this class "Tilelist"
 * The reason behind this is to make the programming overlook more simple, on top of that the customer also wanted this is a requirement
 */

        liste = new Tile[12];
        liste[2] = new Tile(lang.title2(), lang.spacetext2(),    250);
        liste[3] = new Tile(lang.title3(), lang.spacetext3(),    -100);
        liste[4] = new Tile(lang.title4(), lang.spacetext4(),    100);
        liste[5] = new Tile(lang.title5(), lang.spacetext5(),    -20);
        liste[6] = new Tile(lang.title6(), lang.spacetext6(),    180);
        liste[7] = new Tile(lang.title7(), lang.spacetext7(),    0);
        liste[8] = new Tile(lang.title8(), lang.spacetext8(),    -70);
        liste[9] = new Tile(lang.title9(), lang.spacetext9(),    60);
        liste[10] = new Tile(lang.title10(), lang.spacetext10(), -80);
        liste[11] = new Tile(lang.title11(), lang.spacetext11(), -50);
        liste[12] = new Tile(lang.title12(), lang.spacetext12(), 650);
        /*liste[13] = new Tile(lang.title13(),lang.spacetext13(),     );
        liste[14] = new Tile(lang.title14(),lang.spacetext14(),     );
        liste[15] = new Tile(lang.title15(),lang.spacetext15()      );
        liste[16] = new Tile(lang.title16(),lang.spacetext16(),     );
        liste[17] = new Tile(lang.title17(), lang.spacetext17(), -100);
        liste[18] = new Tile(lang.title18(), lang.spacetext18(), 100);
        liste[19] = new Tile(lang.title19(), lang.spacetext19(), -20);
        liste[20] = new Tile(lang.titl20(), lang.spacetext20(),  180);
        liste[21] = new Tile(lang.title21(), lang.spacetext21(), 0);
        liste[22] = new Tile(lang.title22(), lang.spacetext22(), -70);
        liste[23] = new Tile(lang.title23(), lang.spacetext23(), 60);
        liste[24] = new Tile(lang.title24(), lang.spacetext24(), -80);*/

    }

    /**
     * Getter method for the value, in index i of liste.
     * @param i the index of liste[]
     * @return the value of the tile stored in list[i]
     */
    public int getValue(int i){
        return liste[i].getValue();
    }

    /**
     * Getter method for the title, in index i of liste.
     * @param i the index of liste[]
     * @return the title of the tile stored in list[i]
     */
    public String getTitle(int i){
        return liste[i].getTitle();
    }

    /**
     * Getter for the flavour text in index i of liste.
     * @param i the chosen index of liste[]
     * @return the title of the tile stored in liste[i]
     */
    public String getFlavourText(int i){
        return liste[i].getFlavourText();
    }
}