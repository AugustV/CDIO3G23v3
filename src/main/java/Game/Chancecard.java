package Game;
public class Chancecard {
    private  String text;
    private  String name;
    private String Titel;
    private int nummer;
    private String flavourtext;
    public String getText() {
        return text;
    }
    public String getName() {
        return name;
    }
    public int getNummer() {
        return nummer;
    }
    /*
    Her er get metoder til hver af de forskellige variabler.

     */

    public Chancecard(String name, String text, int number ){
        /*
        Objektet Chancecard tager parameterne String name, String text, og et tal int number.

         */

    this.name=name;
    this.text = text;
    this.nummer=number;
    }
}
