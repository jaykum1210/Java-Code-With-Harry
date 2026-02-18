class Circle{
    public int radius;

    public Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    
}

class Cylinder extends Circle{
    public int height;

    public Cylinder(int r, int h){
        super(r);
        this.height = h;
    }

    public double volumn(){
        return Math.PI*this.radius*this.height*this.radius;
    }
    
}

class Rectangle{
    public int length;
    public int breadth;

    public Rectangle(){
        System.out.println("This is Constructor of Rectangle");
    }
    // public Rectangle(int length,int breadth){
    //     this.length = length;
    //     this.breadth = breadth;
    // }

    public void setlength(int lenght){
        this.length = lenght;
    }
    public void setbreadth(int breadth){
        this.breadth = breadth;
    }

    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }

    public int area(){
        return this.length*this.breadth;
    }

    public int perimeter(){
        return 2*(this.breadth + this.length);
    }
}

class Cuboid extends Rectangle{
    public int height;

    public Cuboid(){
        System.out.println("Cuboid");
    }
    // public Cuboid(int lenght, int breadth, int height){
    //     // super(lenght,breadth);
    //     this.height = height;
    // }

    public void setheight(int height){
        this.height = height;
    }
    public int getheight(){
        return height;
    }

    public int volumn(){
        return this.length*this.breadth*this.height;
    }

}

public class Chapter10{
    public static void main(String[] args) {

        // Question 1 Circle and Cylinder

        // Circle c = new Circle(10);
        // System.out.println(c.area());
        // Cylinder cy = new Cylinder(10,20);
        // System.out.println(cy.area());
        // System.out.println(cy.volumn());

        // Question 2 Rectangle and Cuboid

        // Rectangle r = new Rectangle(10,20);
        // System.out.println("Area : " + r.area());

        Rectangle r1 = new Rectangle();
        r1.setlength(10);
        r1.setbreadth(20);

        System.out.println("Area : " + r1.area());
        System.out.println("Perimeter : " + r1.perimeter());

        // Cuboid cu = new Cuboid(10,20,30);
        // System.out.println("Volumn : " + cu.volumn());

        Cuboid cu1 = new Cuboid();
        cu1.setlength(100);
        cu1.setbreadth(200);
        cu1.setheight(10);
        System.out.println("Volumn : " + cu1.volumn());
    }
}