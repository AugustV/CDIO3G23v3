public class Language {
    public static final String YOU_ROLLED = "You rolled ";

    /**
     * This constructor for the Language class allows other classes to great instances of the Language class
     */
    public Language(){

    }

    /**
     * The following lines of code contains String methods for title and flavour text for the various spaces in the game
     * The idea is that these String objects can be refered to in the various System.out.println statements within other classes
     * The purpose with this is that it is much easier to translate the game into other languages because the text is all contained in this one class
     */

    public static String title2(){
        String title = "Tower";
        return title;
    }
    public static String spacetext2 (){
        String space2 = " You visit the great tower and find a chest filled with ancient coins. ";
        return space2;
    }
    public static String title3(){
        String title = "Crater";
        return title;
    }
    public static String spacetext3() {
        String space3 = " You fall into the great crater and is forced to pay for a rescue helicopter. ";
        return space3;
    }
    public static String title4(){
        String title = "Palace gates";
        return title;
    }
    public static String spacetext4(){
        String space4 = " At the great Palace gate you find a wallet filled with cash. ";
        return space4;
    }
    public static String title5(){
        String title = "Cold Desert";
        return title;
    }
    public static String spacetext5(){
        String space5 = " Whilst wandering the cold desert you loose some of your money doing the long hike. ";
        return space5;
    }
    public static String title6(){
        String title = "Walled city";
        return title;
    }
    public static String spacetext6(){
        String space6 = " You receive great gifts  from the people of the walled city. ";
        return space6;
    }
    public static String title7(){
        String title = "Monastery";
        return title;
    }
    public static String spacetext7(){
        String space7 = " You spend the night as a guest at the monastery. ";
        return space7;
    }
    public static String title8(){
        String title = "Black cave";
        return title;
    }
    public static String spacetext8(){
        String space8 = " You travel through the pitch black caves, in the darkness you drop some coins down a ravine never to be found. ";
        return space8;
    }
    public static String title9(){
        String title = "Huts in the mountains";
        return title;
    }
    public static String spacetext9(){
        String space9 = " You find a pile of silver whilst making camp at the old mountain hut. ";
        return space9;
    }
    public static String title10(){
        String title = "Werewall";
        return title;
    }
    public static String spacetext10(){
        String space10 = " You pay a visit to the mysterious Werewall, doing the night coins disapear from your wallet without a trace. ";
        return space10;
    }
    public static String title11(){
        String title = "The pit";
        return title;
    }

    public static String spacetext11(){
        String space11 = " You fall into a deep pit and must pay a crane operator to get you out. ";
        return space11;
    }
    public static String title12(){
        String title = "Goldmine";
        return title;
    }
    public static String spacetext12(){
        String space12 = " You stumble into an abandoned goldmine, in there you find mountains of gold left behind. ";
        return space12;
    }

    /**
     * The following methods contain other Strings of text use throughout the game
     */
    public static String welcome(){
        String welcome = " Welcome to the game!";
        return welcome;
    }
    public static String start(){
        String start = " Press Enter to start the game. ";
        return start;
    }
    public static String askname1(){

        String askname1 = " Please type the name of player 1 ";
        return askname1;
    }
    public static String askname2(){

        String askname2 = " Please type the name of player 2 ";
        return askname2;
    }
    public static String extraturn(){
        String extraturn = " The next day you wake up with renewed energy, you immediately take an extra turn ";
        return extraturn;
    }
    static String and(){
        String and = " and ";
        return and;
    }
    public static String enter(){
        String enter = " Press Enter to continue ";
        return enter;
    }
    public static String victory(){
        return " has won the game!";
    }


    public static String getYouRolled() {
        return YOU_ROLLED;
    }

    static String Getname1() {
        return "Please enter the name of the first player: ";
    }

    static String GetName2() {
        return "Please enter the name of the second player: ";
    }

    static String getWelcome_to_the_game_() {
        return "welcome to the game ";
    }

    static String You_Won_With() {
        return "you won with ";
    }

    static String You_Have_Won_The_Game() {
        return " you have won the game";
    }

    static String Congratulations() {
        return "congratulations ";
    }

    static String Your_Total_Is_Now() {
        return "Your total is now ";
    }

    static String Points() {
        return " points.";
    }

    static String You_Have_Gained() {
        return "You have gained ";
    }

    static String You_Landed_On_The_Tile() {
        return "You landed on the tile: ";
    }

    static String S_Turn_Press_Enter_To_Roll_The_Dice() {
        return "'s turn, press enter to roll the dice";
    }

    static String It_Is() {
        return "it is ";
    }
}