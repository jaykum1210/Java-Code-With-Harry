class VarArgs{
    static int sum(int x,int ...arr){
        // It make it array int arr[]
        int result = 0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2,3 : " + sum(2,3));
        System.out.println("Sum of 2,3,4 : " + sum(2,3,4));
        System.out.println("Sum of 2,3,4,5 : " + sum(2,3,4,5));
        System.out.println("Sum of 2,3,4,5,6 : " + sum(2,3,4,5,6));
        // This will Give 0 as output to avoid this we give "int x" in the sum method and after this we can't call the sum function empty
        // System.out.println("Sum : " + sum());
    }
}