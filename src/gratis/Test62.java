package gratis;

public class Test62 {

    static int count = 0;
    int i = 0;

    public void changeCount() {

        while(i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test62 test1 = new Test62();
        Test62 test2 = new Test62();

        test1.changeCount();
        test2.changeCount();

        System.out.println(test1.count +", "+  test2.count);
    }
}
