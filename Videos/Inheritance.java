class Base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x = x;
    }
    public void print(){
        System.out.println("Base");
    }
}

class Derieved extends Base{
    int y;

    public void sety(int y){
        this.y = y;
    }

    public int gety(){
        return y;
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Base b = new Base();
        b.setx(10);
        System.out.println("X Value : " + b.getx());

        Derieved d = new Derieved();
        d.sety(20);
        System.out.println("Y Value : " + d.gety());
        System.out.println("X Value using derived : " + d.getx());
        d.setx(100);
        System.out.println("X Value after set using derieved : " + d.getx());
        d.print();
    }
}