class Foreachloop{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70};
        System.out.println(arr.length);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        System.out.print("Array in reverse order : ");
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // For Each Loop
        for(int elements : arr){
            System.out.println(elements);
        }
    }
}