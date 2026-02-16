
import java.util.Scanner;

class Forloop{
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // for(int i = 0;i<a;i++){
        //     System.out.println(2*i+1);
        // }

        for(int i = a;i!=0;i--){
            System.out.println(i);
        }
    }
}