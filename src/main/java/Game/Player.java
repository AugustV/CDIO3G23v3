package Game;
import gui_fields.GUI_Player;
public class Player {   //laver en player classe
    private int saldo;  //laver en saldo til en player classe
    public String navn; //laver et navn til hver player
    private int felt;   //laver en integer der hedder felt som fortæller hvor spilleren er lige nu
    private boolean fængselstatus;  //laver en fængselstatus som bruges til at man skal køre en runde mere
    private GUI_Player gui_player;  //laver en gui_player til hver spiller
    public GUI_Player getGui_player() { //laver et objekt der kan returnere en gui player
        return gui_player;
    }
    /**
     * @param n står for navn. så hver player har et navn
     * @param saldo er hvor mange penge spilleren har tilbage
     * @param felt er hvor spilleren er lige nu på brættet
     * @param gui_player hver spiller har også en gui spiller
     */
    public Player (String n, int saldo, int felt, GUI_Player gui_player){   //laver et player objekt der skal indeholde noget bestemte parameter)
        this.navn = n;
        this.saldo = saldo;
        this.felt = felt;
        fængselstatus = false;  //indeholder også fængselstatus som altider er sat til false
        this.gui_player = gui_player;
    }
    public int GetSaldo (){ //
        return this.saldo;
    }

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