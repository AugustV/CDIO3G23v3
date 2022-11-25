package Game;

public class Chancecarddeck {

    private Chancecard[] deck;
    private static Chancecarddeck single_instance = null;

    private Chancecarddeck(){
        deck = new Chancecard[12];
        int i = 0;

        deck[i++] = new Chancecard("Lottery","You win the lottery, you got 3 coins",3); //1
        deck[i++] = new Chancecard("Federal Grant","Your business recieved a federal grant, you got 5 coins",5); //2
        deck[i++] = new Chancecard("Free Burger","You get a free burger coupon, you got 1 coin",1); //3
        deck[i++] = new Chancecard("Bad investment","You have lost money on an investment, you lost 2 coins",-2);//4
        deck[i++] = new Chancecard("Counterfeitbills","Some of the cash you own turned out to be counterfeit, you lost 1 coin",-1);//5
        deck[i++] = new Chancecard("Inflation","You have lost money on an investment, you lost 1 coin",-1);//6
        deck[i++] = new Chancecard("Gamestop","You got in on gamestop before the squeeze, you got 8 coins",8);//7
        deck[i++] = new Chancecard("Get out of jail","You can get out of prison next time you end up there",0);//8
        deck[i++] = new Chancecard("Bad Exposure","Some of the bonds on your account go to zero, you lost 5 coins",-5);//9
        deck[i++] = new Chancecard("Big time investment","You gain an influx of capital from an investor, you got 5 coins",5);//10
        deck[i++] = new Chancecard("Gold reserves","Your gold ses a large appreciation, you got 7 coins",7);//11
        deck[i++] = new Chancecard("Black Monday","The markets drop and you lost a vast amount of money, you lost 8 coins",-8);//12

    }
    public int getnumber(int i) {return deck[i].getNummer();}
    public String getText(int i) {return deck[i].getText();}
    public String getTitle(int i) {return deck[i].getName();}

    public static Chancecarddeck getInstance()
    {
        if(single_instance == null)
            single_instance = new Chancecarddeck();
        return single_instance;

    }


}

