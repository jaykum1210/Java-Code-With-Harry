
import java.util.Scanner;

class Chapter7 {
    static void table(int a){
        for(int i = 1;i<11;i++){
            System.out.println(a + " X " + i + " = " + (a*i));
        }
    }
    static void pattern(int a){
        for(int i = 0;i<a;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static int sum(int a){
        if(a==0){
            return 0;
        }
        else{
            return a+sum(a-1);
        }
    }
    static void pattern1(int a){
        for(int i = 0;i<a;i++){
            for(int j = a-i-1;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
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

    static float avg(int ...arr){
        int sum = 0;
        for(int a:arr){
            sum+=a;
        }
        return (float)sum/arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Multiplication table
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        table(a);

        // Pattern
        System.out.println("Enter number : ");
        int b = sc.nextInt();
        pattern(b);

        // Sum of first n numbers

        System.out.println("Enter Number : ");
        int c = sc.nextInt();
        int num = sum(c);
        System.out.println("Sum of first " + c + " Number : " + num);

        // Pattern 2

        System.out.println("Enter number : ");
        int d = sc.nextInt();
        pattern1(d);

        // Fibonacci Series
        System.out.println("Enter nuumber : ");
        int e = sc.nextInt();
        System.out.print("Fibonacci Series : ");
        for(int i = 0;i<e;i++){
            System.out.print(fibonacci(i) + " ");
        }

        // Average
        System.out.println("Average of 2,3,4,5,6 : " + avg(2,3,4,5,6));
    }
}