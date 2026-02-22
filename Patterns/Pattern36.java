package Patterns;

import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            char ch = (char)('A' + i);
            for(int j = 0;j<a-i;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
