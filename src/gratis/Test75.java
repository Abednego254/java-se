package gratis;

public class Test75 {
    public static int stVar = 100;
    public int var = 200;

    public String toString() {
        return var +":"+ stVar;
    }

    public static void main(String[] args) {
        Test75 test1 = new Test75();
        test1.var = 300;
        System.out.println(test1);

        Test75 test2 = new Test75();
        test2.stVar = 300;
        System.out.println(test2);
    }
}
