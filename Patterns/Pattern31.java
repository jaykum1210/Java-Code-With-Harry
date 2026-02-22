package Patterns;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();

        int num;
        for(int i = 0; i < 2*a-1; i++){
            num = 1;
            if(i<a){
                for(int j = 0; j < i; j++){
                    System.out.print("  ");
                    num++;
                }
                for(int j = 0;j<(2*(a-i)-1);j++){
                    System.out.print(num++ + " ");
                }
            }
            else{
                for(int j = 0;j<(2*a-i-2);j++){
                    System.out.print("  ");
                    num++;
                }
                for(int j = 0;j<(2*(i-a)+3);j++){
                    System.out.print(num++ + " ");
                }
            }
            System.out.println();
        }
    }
}
