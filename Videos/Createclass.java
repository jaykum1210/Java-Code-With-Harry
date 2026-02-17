class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}

class Createclass{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 10;
        emp.name = "Jay";
        emp.printdetails();
    }
}