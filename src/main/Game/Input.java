import java.util.Scanner;
public class Input {
    /**
     * Method that creates a scanner and holds the next input from keyboard in the variable s.
     *
     * @return awaits an input from the user before the game will proceed.
     */

    public static String enter() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
}