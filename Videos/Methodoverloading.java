class Methodoverloading{
    public static void change(int [] arr){
        arr[0] = 100;
    }
    public static void change(int a){
        System.out.println("Hello"+a);
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        change(arr);
        System.out.println("Array at 0 : " + arr[0]);
        change(10);
    }
}