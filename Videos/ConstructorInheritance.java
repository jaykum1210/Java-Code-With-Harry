class Base{
    int x;
    public void print(){
        System.out.println("Base");
    }

    public Base(){
        System.out.println("Hello from Base class constructor");
    }

    public Base(int a){
        System.out.println("Value : " + a);
    }
}

class Derieved extends Base{
    int y;

    public Derieved(){
        // super(10);
        System.out.println("Hello from deriver class constructor");
    }
    public Derieved(int a,int b){
        super(a);
        System.out.println("Value : " + b);
    }
}

class Child extends Derieved{
    int z;

    public Child(){
        System.out.println("Hello from child class constructor");
    }
    public Child(int a, int b, int c){
        super(a,b);
        System.out.println("Value : " + c);
    }
}

public class ConstructorInheritance{
    public static void main(String[] args) {
        // Base b = new Base();
        // Derieved d = new Derieved(10,20);
        // Child c = new Child();
        Child c = new Child(10,20,30);
    }
}