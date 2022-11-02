public class Player {

    private int saldo;
    public String navn;

    /**
     *
     * @param n This allows the player to get a personal name
     * @param saldo The player get's a saldo attached to it's name (n)
     */
    public Player (String n, int saldo){
        this.navn = n;
        this.saldo = saldo;
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
}