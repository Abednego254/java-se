package varargs;

public class Test {
    public int howMany(boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int b2 = t.howMany(new boolean[] {true, false, true});

        System.out.println(b2);
    }
}
