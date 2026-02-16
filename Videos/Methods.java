class Methods{
    public static int add(int a, int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a,b);
        System.out.println("Sum : " + c);

        Methods obj = new Methods();
        int d = obj.sub(a,b);
        System.out.println("Subtraction : " + d);

    }
}