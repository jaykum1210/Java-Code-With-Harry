package Patterns;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0; i < 2 * a-1; i++) {
            if (i < a) {
                for (int j = 0; j < a - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (2 * i + 1); j++) {
                    if (j == 0 || j == (2*i)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < i - a+1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (2*(2*a-i)-3); j++) {
                    if(j==0 || j == (2*(2*a-i)-4)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
