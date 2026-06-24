package gratis.Pep4Sure;

public class Test75 {
    public static int stVar = 100;
    public int var = 200;
    public String toString() {
        return var + " : " + stVar;
    }

    public static void main(String[] args) {
        Test75 t1 =  new Test75();
        t1.var = 300;
        System.out.println(t1);
        Test75 t2 = new Test75();
        t2.stVar = 300;
        System.out.println(t2);
    }
}
