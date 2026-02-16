
import java.util.Scanner;

class Dowhile{
    public static void main(String[] args) {
        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<=5);

        // Quick Code
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k<=j);
    }


}