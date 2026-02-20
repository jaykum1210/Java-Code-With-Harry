package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<a-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
