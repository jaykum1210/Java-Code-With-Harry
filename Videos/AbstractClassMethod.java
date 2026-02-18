
abstract class Base{
    public Base(){
        System.out.println("Hello this is parent constructor");
    }
    public void Hello(){
        System.out.println("Hello");
    }
    abstract public void Bye();
}

class Child extends Base{
    public Child(){
        System.out.println("Hello this is child constracutor");
    }
    @Override
    public void Bye(){
        System.out.println("Byee");
    }
    @Override
    public void Hello(){
        System.out.println("hi");
    } 
}

abstract class Child2 extends Base{
    public void Greet(){
        System.out.println("Good Afternoon");
    }
}

public class AbstractClassMethod{
    public static void main(String[] args) {
        Child c = new Child();
        c.Hello();
        c.Bye();
        // Child2 c2 = new Child2();
    }
}