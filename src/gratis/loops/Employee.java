package gratis.loops;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee(){
        name = "John Doe";
        contract = true;
        salary = 100.0f;
    }

    @Override
    public String toString() {
        return name + " " + contract + " " + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
//        e.name = "John";
//        e.contract = true;
//        e.salary = 5000;
        System.out.println(e);
    }
}
