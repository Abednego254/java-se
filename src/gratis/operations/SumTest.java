package gratis.operations;

public class SumTest {
    public static void doSum(Integer x, Integer y) {
    System.out.println("Integer sum is: "+ (x + y));
    }

//    public static void doSum(double x, double y) {
//        System.out.println("Double sum is: "+ (x + y));
//    }

    public static void doSum(float x, float y) {
        System.out.println("Float sum is: "+ (x + y));
    }

    public static void doSum(long x, long y) {
        System.out.println("Long sum is: "+ (x + y));
    }

    public static void main(String[] args) {
        doSum(10, 20);
//        doSum(10.0, 20.0);
    }
}
