package Game;
public class Player {
    private int saldo;
    public String navn;
    private int felt;
    private boolean fængselstatus;
    /**
     *
     * @param n This allows the player to get a personal name
     * @param saldo The player get's a saldo attached to it's name (n)
     */
    public Player (String n, int saldo, int felt){
        this.navn = n;
        this.saldo = saldo;
        this.felt = felt;
        fængselstatus = false;
    }
    /**
     * We told the program each tile has a value, in this section we ask the program to tell us what saldo is before rolling the dices
     * @return The program returns the saldo
     */
    public int GetSaldo (){
        return this.saldo;
    }
    /**
     *
     * @param ammount This section adds the value of the tile + the saldo
     * @return The program returns the new saldo after the player have moved to a tile
     */
    public int AddToSaldo (int ammount){
        saldo = saldo + ammount;
        return saldo;
    }
    public String toString (){
        return this.navn;
    }
    public int GetFelt () {return this.felt;}
    public int AddToFelt (int ammount){
        felt = felt + ammount;
        return felt;
    }
    public boolean getFængselstatus() {
        return fængselstatus;
    }
    public boolean setFængselstatusTrue(){
        fængselstatus = true;
        return fængselstatus;
    }
    public boolean setFængselstatusFalse(){
        fængselstatus = false;
        return fængselstatus;
    }

    public void setBalance(int getSaldo) {
    }
}