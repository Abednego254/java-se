package exceptions;

public class Cat {
    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");

        } catch (NullPointerException e) {
            System.out.print("4");
        }
//        } catch (NumberFormatException e) {
//            System.out.println("9");
//        }

        System.out.print("5");
    }

    public static void main(String[] args) throws NullPointerException {
        Cat leo = new Cat();
        leo.name = "Leo";
        leo.parseName();
        System.out.print("6");
    }
}