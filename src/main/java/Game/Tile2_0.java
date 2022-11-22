package Game;
public class Tile2_0 {  //laver en tile classe
    private String Type;    //laver en type String til vores array
    private boolean OwnershipStatus;    //laver et ownershipstatus til vores array
    private Player Owner;   //laver en owner ud fra en player til vores array
    private int Rent;   //laver en rent til vores array
    private int Salesprice; //laver en salesprices til vores array
    public Tile2_0(String Type, int rent, int salesprice){  //opretter vores parameter til vores array
        this.Type = Type;   //sætter typen til det vi får ind
        this.OwnershipStatus = false;   //sætter vores ownershipstatus til false da ingen ejer et felt til at starte med
        this.Owner = null;  //sætter vores owner til null da ingen ejer feltet lige nu
        this.Rent = rent;   //sætter rent til det vi får ind
        this.Salesprice = salesprice;   //sætter salesprice til det vi får ind
    }
    public String getType() {return Type;}  //metode til at få typen ud af vores felt
    public boolean getOwnershipStatus() {return OwnershipStatus;}   //metode til at få ownershipstatus ud at et felt
    public Player  getOwner() {return Owner;}   //en metode til at få owner af et felt ud
    public void setOwner(Player newOwner) { //en metode til at ændre på ejeren af et felt
        Owner = newOwner;   //sætter ejeren til en bestem spiller
        OwnershipStatus = true; //sætter ownershipstatus til true
    }
    public int getRent() {return Rent;} //en metode til at få huslejen ud af et felt
    public int getSalesprice() {return Salesprice;} // en metode til at få salgsprisen ud af et felt
}