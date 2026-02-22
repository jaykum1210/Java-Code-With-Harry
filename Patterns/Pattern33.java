package Patterns;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int num =0;
        for(int i = 0;i<a;i++){
            for(int j = 0;j<=i;j++){
                num%=9;
                System.out.print((num+1) + " ");
                num++;
            }
            System.out.println();
        }
    }
}
