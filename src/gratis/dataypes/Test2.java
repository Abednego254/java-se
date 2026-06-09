package gratis.dataypes;

public class Test2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(isAvailable +" ");
        isAvailable = t.doStuff();
        System.out.println(isAvailable +" ");
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
