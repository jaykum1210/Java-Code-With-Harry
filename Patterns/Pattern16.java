package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();

        for (int i = 0; i < 2 * a; i++) {
            if (i < a) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= (2 * (a - i) - 1); j++) {
                    if (j % 2 != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            else{
                for(int j = 0;j<(2*a-i-1);j++){
                    System.out.print("  ");
                }
                for(int j = 0;j<=(2*(i-a)+1);j++){
                    if(j%2!=0){
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
