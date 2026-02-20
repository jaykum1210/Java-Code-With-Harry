package Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            int num = 0;
            for (int j = 0; j <=(2 * (a - i) - 1); j++) {
                if (j % 2 != 0) {
                    System.out.print(++num + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
