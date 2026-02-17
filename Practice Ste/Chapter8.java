class Employee {

    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String a) {
        name = a;
    }

    public void printdetails() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class CellPhone {

    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling...");
    }
}

class square {

    int side;

    public int area() {
        return side * side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}

class TommyViceCity{
    public void hitting(){
        System.out.println("Hitting");
    }
    public void running(){
        System.out.println("Running");
    }
    public void firing(){
        System.out.println("Firing");
    }
}

class Circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}

public class Chapter8 {

    public static void main(String[] args) {

        // Question 1 - Employee
        Employee emp = new Employee();
        emp.name = "Jay";
        emp.salary = 10000;
        emp.printdetails();
        System.out.println("Name : " + emp.getname());
        System.out.println("Salary : " + emp.getsalary());
        emp.setname("Jay Kumawat");
        emp.printdetails();

        // Question 2 - Phone
        CellPhone phone = new CellPhone();
        phone.ringing();
        phone.vibrate();
        phone.callFriend();

        // Question 3 - Square
        square sq = new square();
        sq.side = 10;
        System.out.println("Area : " + sq.area());
        System.out.println("Perimeter : " + sq.perimeter());

        // Question 4 - Rectangle
        rectangle rec = new rectangle();
        rec.length = 10;
        rec.width = 5;
        System.out.println("Area : " + rec.area());
        System.out.println("Perimeter : " + rec.perimeter());

        // Question 5 - Vice City
        TommyViceCity viceCity = new TommyViceCity();
        viceCity.hitting();
        viceCity.running();
        viceCity.firing();

        // Question 6 - Circle
        Circle cir = new Circle();
        cir.radius = 8;
        System.out.println("Area : " + cir.area());
        System.out.println("Perimeter : " + cir.perimeter());
    }
}
