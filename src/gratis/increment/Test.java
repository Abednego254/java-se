package gratis.increment;

public class Test {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int d = x;
        int b = ++x;
        int c = x++;
//        int d = (a < b) ? (a < c) ? a: (b < c) ? b: c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
    }
}
