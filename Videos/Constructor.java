
class Employee {

    private int id;
    private String name;

    public Employee() {
        id = 10000;
        name = "BYeeeeeee";
    }

    public Employee(String Name,int ids) {
        id = ids;
        name = Name;
    }

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        this.name = n;
    }

    public String getname() {
        return name;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Hello",120);
        Employee emp2 = new Employee();
        // emp.setid(10);
        // emp.setname("Jay Kumawat");
        System.out.println("Id : " + emp1.getid());
        System.out.println("Name : " + emp1.getname());

        System.out.println("Id : " + emp2.getid());
        System.out.println("Name : " + emp2.getname());
    }
}
