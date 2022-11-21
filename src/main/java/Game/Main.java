package Game;
public class Main {
    public static void main(String[] args) {
        Player[] players =  GameStart.gamestart(); //starter spillet med antal spillere
        Game.runGame(); //spillet kører indtil nogen taber
    }
}