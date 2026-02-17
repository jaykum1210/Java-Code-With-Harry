class Cylinder{
    private int height;
    private int radius;

    // Question 1 Set and Get

    public Cylinder(){
    }
    public void setheight(int a){
        this.height = a;
    }
    public int getheight(){
        return height;
    }
    public void setradius(int a){
        this.radius = a;
    }
    public int getradius(){
        return radius;
    }

    // Question 2 Area and volumn 
    public float area(){
        return 2*3.14f*radius*height + 2*3.14f*radius*radius;
    }
    public float volumn(){
        return 3.14f*radius*radius*height;
    }

    // Question repeat question 1 using constructor

    public Cylinder(int height, int radius){
        this.height = height;
        this.radius = radius;
    }
}


// Question 4
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}


// Question 5
class Sphere{
    private int radius;
    
    public Sphere(){}
    public void setradius(int radius){
        this.radius = radius;
    }
    public int getradius(){
        return radius;
    }

    public float area(){
        return 4*3.14f*radius*radius;
    }
    public float volumn(){
        return (float)(4.0/3.0)*3.14f*radius*radius*radius;
    }

    public Sphere(int radius){
        this.radius = radius;
    }
}

public class Chapter9{
    public static void main(String[] args) {

        // Question 1
        Cylinder cy1 = new Cylinder();
        cy1.setheight(10);
        cy1.setradius(20);

        // Question 2
        System.out.println("Area : " + cy1.area());
        System.out.println("Volumn : " + cy1.volumn());

        // Question 3
        Cylinder cy2 = new Cylinder(10,20);
        System.out.println("Area : " + cy2.area());
        System.out.println("Volumn : " + cy2.volumn());

        // Question 4
        Rectangle r1 = new Rectangle();
        System.out.println("Length : " + r1.getlength());
        System.out.println("Breadth : " + r1.getbreadth());

        Rectangle r2 = new Rectangle(10,20);
        System.out.println("Length : " + r2.getlength());
        System.out.println("Breadth : " + r2.getbreadth());


        // Question 5
        Sphere sp1 = new Sphere();
        sp1.setradius(10);
        System.out.println("Radius : " + sp1.getradius());
        System.out.println("Area : " + sp1.area());
        System.out.println("Volumn : " + sp1.volumn());

        Sphere sp2 = new Sphere(10);
        System.out.println("Radius : " + sp2.getradius());
        System.out.println("Area : " + sp2.area());
        System.out.println("Volumn : " + sp2.volumn());
    }
}