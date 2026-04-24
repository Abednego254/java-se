package ExamTopics;

public class Employee {
    public int salary;
}
class Manager extends Employee {
    public int budget;
}
class Director extends Manager {
    public int stockOptions;
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();
//        System.out.println(director.stockOptions = 1000);
        System.out.println(director.salary);

    }
}
