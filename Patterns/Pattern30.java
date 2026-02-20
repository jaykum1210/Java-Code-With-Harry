package Patterns;

import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();

        for(int i = 0;i<2*a-1;i++){
            for(int j = 0;j<2*a-1;j++){
                if(i==j || j == a-i+1){
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
