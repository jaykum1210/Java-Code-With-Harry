class Employee{
    private int id;
    private String name;
    public void setid(int i){
        this.id = i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        this.name = n;
    }
    public String getname(){
        return name;
    }
}

public class AccessModifier{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setid(10);
        emp.setname("Jay Kumawat");
        System.out.println("Id : " + emp.getid());
        System.out.println("Name : " + emp.getname());
    }
}