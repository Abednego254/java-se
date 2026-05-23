package exceptions;

public class Mouse {
    public String name;

    public void run() {
        System.out.print("1");

        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");

        } catch (NullPointerException e) {
            System.out.print("4");
            throw e; // Rethrow exception
        }

        System.out.print("5");
    }

    public static void main(String[] args) {

        Mouse jerry = new Mouse();

        try {
            jerry.run();

        } catch (NullPointerException e) {
            System.out.print("6");
        }

        System.out.print("7");
    }
}