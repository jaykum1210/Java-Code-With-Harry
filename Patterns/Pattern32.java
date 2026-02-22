package Patterns;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int num;
        for (int i = 0; i < 2 * a-1; i++) {
            num = 0;
            if (i < a) {
                for (int j = 0; j < a - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (2 * i + 1); j++) {
                    if (j % 2 != 0) {
                        System.out.print("  ");
                    } else {
                        num++;
                        if(j == 0 || j == (2*i)){
                        System.out.print(num + " ");
                        }
                        else{
                        System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j <=i - a; j++) {
                    System.out.print("  ");
                }
                for(int j = 0; j < (2 * (2 * a - i) - 3);j++){
                    if(j%2==0){
                        num++;
                        if(j == 0 || j == (2*(2*a-i)-4)){
                            // System.out.print("* ");
                            System.out.print(num + " ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();

            }
        }
    }
}
