class Phone{
    public void greet(){
        System.out.println("Hello");
    }
    public void on(){
        System.out.println("Phone is on...");
    }
}

class Smartphone extends Phone{
    public void name(){
        System.out.println("Samsung");
    }
    @Override
    public void on(){
        System.out.println("Smartphone is on...");
    }
}

public class DynamicMethod{
    public static void main(String[] args) {
        Phone p = new Smartphone();
        p.greet();
        // p.name();
        p.on();
    }
}