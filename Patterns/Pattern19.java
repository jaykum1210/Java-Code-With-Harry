package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();

        for(int i = 0;i<a;i++){
            for(int j = 0;j<a;j++){
                if(i==0 || j == 0 || j == a-1 || i == a-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
