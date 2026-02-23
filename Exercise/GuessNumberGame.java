import java.util.Random;
import java.util.Scanner;

class Game {

    public int number;
    public int userinput;
    public int noofguesses = 0;

    public int getnoofguesses() {
        return noofguesses;
    }

    public void detnoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    public Game() {
        Random r = new Random();
        number = r.nextInt(100) + 1;
    }

    void takeuserInput() {
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();
    }

    boolean iscorrect() {
        noofguesses++;
        if (userinput == number) {
            return true;
        } else if (userinput > number) {
            System.out.println("Greater Number");
            return false;
        } else {
            System.out.println("Lesser Number ");
            return false;
        }
    }
}

public class GuessNumberGame {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeuserInput();
            b = g.iscorrect();
            System.out.println(b);
        }
    }
}
