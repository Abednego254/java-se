package ExamTopics;

import java.util.Scanner;

public class DivideIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstInteger = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondInteger = scanner.nextInt();
        System.out.println("The division is: "+ (firstInteger / secondInteger));
        System.out.println("The remainder after division is: "+ (firstInteger % secondInteger));
    }
}
