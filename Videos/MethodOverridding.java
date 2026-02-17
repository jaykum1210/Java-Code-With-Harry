
class A{
    public int a;
    public void meth1(){
        System.out.println("This is Method of A");
    }
    public void meth2(){
        System.out.println("This is second method of A");
    }
}

class B extends A{
    public int b;
    @Override
    public void meth2(){
        System.out.println("This is Method of B");
    }
    public void meth3(){
        System.out.println("This is second method of B");
    }
}

public class MethodOverridding{
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
