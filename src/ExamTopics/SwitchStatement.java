package ExamTopics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of study: ");
        int year = scanner.nextInt();

        switch (year) {
            case 1:
                System.out.println("Fresher");
                break;
            case 2:
                System.out.println("Second Year");
                break;
            case 3:
                System.out.println("Third Year");
                break;
            case 4:
                System.out.println("Fourth Year");
                break;
            default:
                System.out.println("Invalid Year");
        }
    }
}
