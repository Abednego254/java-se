package exceptions;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Test86 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(null);
        students[1] = new Student("John");
//        students[2] = new Student("Mary");

         for (Student student : students) {
             System.out.print(" "+ student.name);
         }
    }
}
