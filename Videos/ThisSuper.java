class A{
    private int a;
    
    public A(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }
}

class B extends A{
    public B(int a){
        super(a);
        System.out.println("Hello");
    }
}


public class ThisSuper{
    public static void main(String[] args) {
        A a = new A(10);
        System.out.println("Value : " + a.getA());
        B b = new B(20);
        System.out.println("Value : " + b.getA());
    }
}