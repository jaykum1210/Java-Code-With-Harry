package Patterns;

import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<2*a-1;i++){
            if(i<a){
                for(int j = 0;j<=i;j++){
                    System.out.print((j+1) + " ");
                }
            }
            else{
                for(int j = 0;j<(2*a-i-1);j++){
                    System.out.print((j+1) + " ");
                }
            }
            System.out.println();
        }
    }
}
