package Game;
import gui_fields.GUI_Player;
public class Player {   //laver en player classe
    private int saldo;  //laver en saldo til en player classe
    public String navn; //laver et navn til hver player
    private int felt;   //laver en integer der hedder felt som fortæller hvor spilleren er lige nu
    private boolean fængselstatus;  //laver en fængselstatus som bruges til at man skal køre en runde mere
    private GUI_Player gui_player;  //laver en gui_player til hver spiller

    private boolean getoutofjailcard;
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
        getoutofjailcard = false;
        this.gui_player = gui_player;
    }
    public int GetSaldo (){return this.saldo;}  //en metode hvor man kan få en players saldo
    public int AddToSaldo (int ammount){    //metode hvor man kan addere til en players saldo
        saldo = saldo + ammount;    //addere til ens saldo
        return saldo;   //returnere saldo
    }
    public String toString (){return this.navn;}    //returnere en spillers navn
    public int GetFelt () {return this.felt;}   //returnere spillerens nuværende position
    public int AddToFelt (int ammount){ //en metode til at addere til ens position
        felt = felt + ammount;  //tilføjer de eksta tal til ens position så man kommer længere på brættet
        return felt;    //returnere felt
    }
    public boolean getFængselstatus() {return fængselstatus;}   //en metode hvor man kan se om en spiller er i fængsel
    public boolean setFængselstatusTrue(){  //her kan man sætte en spiller til at være i fængsel
        fængselstatus = true;   //sætter fængselstatus boolean til true
        return fængselstatus;   //returnere den nye fængselstatus
    }
    public boolean setFængselstatusFalse(){ //her kan man sætte spilleren til ikke at være i fængsel
        fængselstatus = false;  //sætter fængselstatus til false
        return fængselstatus;   //returnere fængselstatus
    }
    public void setBalance(int getSaldo) {}
    public boolean isGetoutofjailcard() {
        return getoutofjailcard;
    }
    public boolean getoutofjailcardTrue(){  //her kan man sætte en spiller til at være i fængsel
        getoutofjailcard = true;   //sætter fængselstatus boolean til true
        return getoutofjailcard;   //returnere den nye fængselstatus
    }
    public boolean getoutofjailcardFalse(){ //her kan man sætte spilleren til ikke at være i fængsel
        getoutofjailcard = false;  //sætter getoutofjailcard til false
        return getoutofjailcard;   //returnere getoutofjailcard
    }
}