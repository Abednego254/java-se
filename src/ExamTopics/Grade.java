package ExamTopics;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's mark: ");
        int mark = scanner.nextInt();
        if(mark >= 70 && mark <= 100) {
            System.out.println("grade: A");
        } else {
            System.out.println("grade: Not A");
        }
    }
}
