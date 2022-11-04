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
        this.Rent = Rent;
        this.Salesprice = Salesprice;
    }
    public String getType() {return Type;}

    public String getOwner() {return Owner;}
    public void setOwner(String newOwner) {
        Owner = newOwner;
        OwnershipStatus = true;
    }

    public int getRent() {return Rent;}

    public int getSalesprice() {return Salesprice;}

    public boolean IsOwned() {
        return OwnershipStatus;
    }

}
