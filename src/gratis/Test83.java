package gratis;

public class Test83 {
    static int x = 3, y = 5;

    public Test83(int x, int y) {
        initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        Test83 test = new Test83(x, y);

        System.out.println(x + " " + y);
    }
}
