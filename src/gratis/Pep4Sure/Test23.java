package gratis.Pep4Sure;

public class Test23 {
    public static void main(String[] args) {
        Test23 ts = new Test23();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
