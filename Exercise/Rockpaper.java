
import java.util.Random;
import java.util.Scanner;

class Rockpaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char repeat = 'Y';
        while (repeat == 'Y') {
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");
            System.out.println("Enter option : ");
            int option = sc.nextInt();
            if (option < 1 || option > 3) {
                continue;
            }
            int num = r.nextInt(3) + 1;
            switch (option) {
                case 1:
                    if (num == 1) {
                        System.out.println("Match Tie");
                    } else if (num == 2) {
                        System.out.println("Computer Wins! Paper Beats Rock.");
                    } else {
                        System.out.println("Player Wins! Rock Beats Scissor.");
                    }
                    break;
                case 2:
                    if (num == 1) {
                        System.out.println("Player Wins! Paper Beats Rock.");
                    } else if (num == 2) {
                        System.out.println("Match Tie.");
                    } else {
                        System.out.println("Computer Wins! Scissor Beats Paper.");
                    }
                    break;
                case 3:
                    if (num == 1) {
                        System.out.println("Computer Wins! Rock Beats Scissor.");
                    } else if (num == 2) {
                        System.out.println("Player Wins! Scissor Beats Paper.");
                    } else {
                        System.out.println("Match Tie.");
                    }
                    break;
            }
            System.out.println("Want to Play Again('Y'/'N') : ");
            repeat = sc.next().charAt(0);
            repeat = Character.toUpperCase(repeat);
        }
    }
}