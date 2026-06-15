package gratis.selftestengine;

public class Test78 {
    public static final int MIN = 1;

    public static void main(String[] args) {
        int x = args.length;

        if (checkLimit(x)) {
            System.out.println("JAVA SE");
        }
        else {
            System.out.println("JAVA EE");
        }
    }

    public static boolean checkLimit(int x) {
        return (x >= MIN) ? true : false;
    }
}
