package Patterns;

import java.util.Scanner;

public class Pattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            char ch = (char)('A');
            int num = 0;
            for(int j = 0;j<=a-i-2;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<(2*i+1);j++){
                if(j<i){
                    System.out.print((char)(ch + num++) + " ");
                }
                else{
                    System.out.print((char)(ch + num--)+ " ");
                }
            }
            System.out.println();
        }
    }
}
