package Patterns;

import java.util.Scanner;

public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<2*a-1;i++){
            char ch = (char)'A';
            if(i<a){
                for(int j = 0;j<a-i-1;j++){
                    System.out.print("  ");
                }
                for(int j = 0;j<(2*i+1);j++){
                    System.out.print((char)(ch + j) + " ");
                }
            }
            else{
                for(int j = 0;j<=i-a;j++){
                    System.out.print("  ");
                }
                for(int j = 0;j<(2 * (2 * a - i) - 3);j++){
                    System.out.print((char)(ch + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
