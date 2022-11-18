package Game;

public class Tile2_0 {
    private String Type;
    private boolean OwnershipStatus;
    private Player Owner;
    private int Rent;
    private int Salesprice;

    public Tile2_0(String Type, int rent, int salesprice){
        this.Type = Type;
        this.OwnershipStatus = false;
        this.Owner = null;
        this.Rent = rent;
        this.Salesprice = salesprice;
    }
    public String getType() {return Type;}

    public boolean getOwnershipStatus() {return OwnershipStatus;}

    public Player  getOwner() {return Owner;}
    public void setOwner(Player newOwner) {
        Owner = newOwner;
        OwnershipStatus = true;
    }

    public int getRent() {return Rent;}

    public int getSalesprice() {return Salesprice;}

}
