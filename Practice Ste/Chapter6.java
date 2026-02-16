
import java.util.Scanner;

class Chapter6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sum of numbers in float array
        float [] arr4 = new float[5];
        arr4[0] = 10.01f;
        arr4[1] = 10.02f;
        arr4[2] = 10.03f;
        arr4[3] = 10.04f;
        arr4[4] = 10.05f;
        float sum = 0;
        for(float element :arr4){
            sum+=element;
        }
        System.out.println("sum : " + sum);

        //Search element

        System.out.print("Enter size of array : ");
        int a = sc.nextInt();
        int[] arr5 = new int[a];
        System.out.println("Enter " + a + " elements : ");
        for(int i = 0;i<a;i++){
            arr5[i] = sc.nextInt();
        }
        System.out.print("Enter search element : ");
        int b = sc.nextInt();
        int found = 0;
        for(int element : arr5){
            if(element == b){
                found = 1;
                break;
            }
        }
        if(found==1){
            System.out.println(b + " is present");
        }
        else{
            System.out.println(b + " is not present");
        }

        // Average of marks

        System.out.print("Enter size of array : ");
        int c = sc.nextInt();
        int[] arr6 = new int[c];
        System.out.println("Enter " + c + " elements : ");
        for(int i = 0;i<c;i++){
            arr6[i] = sc.nextInt();
        }
        int sum1 = 0;
        for(int element : arr6){
            sum1+=element;
        }
        float average = (float)sum1/c;
        System.out.println("Average = " + average);


        // Add Two matrix

        System.out.println("Enter Row : ");
        int d = sc.nextInt();
        System.out.println("Enter column : ");
        int e = sc.nextInt();
        int[][] max1 = new int[d][e];
        int[][] max2 = new int[d][e];
        for(int i = 0;i<d;i++){
            for(int j = 0;j<e;j++){
                System.out.print("Enter element at row " + (i+1) + " and column "+ (j+1) + " : ");
                max1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<d;i++){
            for(int j = 0;j<e;j++){
                System.out.print("Enter element at row " + (i+1) + " and column "+ (j+1) + " : ");
                max2[i][j] = sc.nextInt();
            }
        }
        int[][] matsum = new int[d][e];

        for(int i = 0;i<d;i++){
            for(int j = 0;j<e;j++){
                matsum[i][j] = max1[i][j] + max2[i][j];
            }
        }

        System.out.println("Sum Matrix : ");
        for(int i = 0;i<d;i++){
            for(int j = 0;j<e;j++){
                System.out.print(matsum[i][j] + " ");
            }
            System.out.println("");
        }


        // Reverse an Array

        System.out.print("Enter size : ");
        int f = sc.nextInt();
        int[] arr7 = new int[f];
        System.out.print("Enter " + f + " elements : ");
        for(int i = 0;i<f;i++){
            arr7[i] = sc.nextInt();
        }
        for(int i = 0;i<f/2;i++){
            int temp = arr7[i];
            arr7[i] = arr7[f-i-1];
            arr7[f-i-1] = temp;
        }
        System.out.print("Reverse Array : ");
        for(int i = 0; i < f; i++){
            System.out.print(arr7[i] + " ");
        }

        // Maximum element

        System.out.print("Enter size : ");
        int g = sc.nextInt();
        int[] arr8 = new int[g];
        System.out.print("Enter " + g + " elements : ");
        for(int i = 0;i<g;i++){
            arr8[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0;i<g;i++){
            if(arr8[i]>max){
                max = arr8[i];
            }
        }
        System.out.println("Maximum element : " + max);

        // Minimum element 

        System.out.print("Enter size : ");
        int h = sc.nextInt();
        int[] arr9 = new int[h];
        System.out.print("Enter " + h + " elements : ");
        for(int i = 0;i<h;i++){
            arr9[i] = sc.nextInt();
        }
        int min = 999999;
        for(int i = 0;i<h;i++){
            if(arr9[i]<min){
                min = arr9[i];
            }
        }
        System.out.println("Minimum Element : " + min);

        //sorted or not
        System.out.print("Enter size : ");
        int l = sc.nextInt();
        int[] arr10 = new int[l];
        System.out.print("Enter " + l + " elements : ");
        for(int i = 0;i<l;i++){
            arr10[i] = sc.nextInt();
        }
        int  sorted = 0;
        for(int i = 0;i<l-1;i++){
            if(arr10[i]>arr10[i+1]){
                sorted = 1;
                System.out.println("Not Sorted");
                break;
            }
        }
        if(sorted==0){
            System.out.println("Sorted");
        }
    }
}