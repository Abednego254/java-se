package gratis.dataypes;

public class Test {
    public static void main(String[] args) {
        int ivar = 100;
        float fvar = 100.100f;
        double dvar = 123;
        ivar = (int) fvar;
        fvar = ivar;
        dvar = fvar;
        fvar = (float) dvar;
        dvar = ivar;
        ivar = (int) dvar;
    }
}
