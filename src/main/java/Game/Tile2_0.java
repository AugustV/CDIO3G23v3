package Game;

public class Tile2_0 {
    private String Type;
    private boolean OwnershipStatus;
    private String Owner;
    private int Rent;
    private int Salesprice;

    public Tile2_0(String Type, int rent, int salesprice){
        this.Type = Type;
        this.OwnershipStatus = false;
        this.Owner = "";
        this.Rent = rent;
        this.Salesprice = salesprice;
    }
    public String getType() {return Type;}

    public boolean getOwnershipStatus() {return OwnershipStatus;}

    public String getOwner() {return Owner;}
    public void setOwner(String newOwner) {
        Owner = newOwner;
        OwnershipStatus = true;
    }

    public int getRent() {return Rent;}

    public int getSalesprice() {return Salesprice;}

}
