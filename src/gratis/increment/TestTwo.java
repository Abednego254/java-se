package gratis.increment;

public class TestTwo {
    static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        TestTwo check1 = new TestTwo();
        TestTwo check2 = new TestTwo();
        TestTwo check3 = new TestTwo();
        check1.changeCount();
        check2.changeCount();
        check3.changeCount();
        System.out.println(check1.count +" : " + check2.count  + " : " + check3.count);
    }
}
