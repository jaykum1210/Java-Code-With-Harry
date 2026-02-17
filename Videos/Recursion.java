
import java.util.Scanner;

class Recursion{

    public static int factorial(int a){
        if(a==0 || a==1){
            return a;
        }
        return a*factorial(a-1);
    }
    public static int fibonacci(int a){
        if(a==0){
            return 0;
        }
        else if(a==1){
            return 1;
        }
        else{
            return fibonacci(a-1) + fibonacci(a-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = factorial(a);
        System.out.println("Factorial of " + a + " is : " + num);

        System.out.print("Fibonacci Series : ");
        for(int i = 0;i<a;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    
}