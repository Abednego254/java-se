package gratis;

public class Test64 {

    public static void main(String[] args) {
        int numbers[];

        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;

        double f = 2.2;
        float d = (float) f;

        int a = 2;
        long g = a;

        long b = 3;
        int h = (int) b;
        System.out.println(g);
        System.out.println(b);


        for (int x : numbers) {
            System.out.print(" "+ x);
        }
    }
}
