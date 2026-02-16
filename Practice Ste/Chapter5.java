
import java.util.Scanner;

class Chapter5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Star Pattern
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Sum of n Even numbers
        System.out.print("Enter Number : ");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += (2 * i);
        }
        System.out.println("Sum : " + sum);

        // Multiplication Table
        System.out.print("Table of : ");
        int c = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(c + " X " + i + " = " + c * i);
        }

        // Multiplication Table in reverse
        System.out.print("Table of : ");
        int d = sc.nextInt();
        for (int i = 10; i >0; i--) {
            System.out.println(d + " X " + i + " = " + d * i);
        }

        // Factorial

        System.out.print("Factorial Numeber : ");
        int e = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=e;i++){    
            fact*=i;
        }
        System.out.println("Factorial of " + e + " = " + fact);

        //Factorial using while loop
        System.out.print("Factorial Numeber : ");
        int f = sc.nextInt();
        int num = 1;
        while (f>0) { 
            num*=f;
            f--;
        }
        System.out.println("factorial : " + num);

        // Sum of all Numbers in table

        System.out.print("Enter Number : ");
        int g = sc.nextInt();
        int ts = 0;
        for(int i = 1;i<=10;i++){
            ts+=(g*i);
        }
        System.out.println("Sum of table = " + ts);

        
    }
}
