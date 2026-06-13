package gratis.BrainDumbs;

public class TestScope {

    static int doCalc(int var1) {
        var1 *= 2;
        return var1;
    }

    public static void main(String[] args) {
        int var1 = 200;
        System.out.println(doCalc(var1));
        System.out.println(var1);
    }
}
