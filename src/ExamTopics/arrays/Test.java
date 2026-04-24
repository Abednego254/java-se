package ExamTopics.arrays;

public class Test {
    public static final int MIN = 1;

    public static void main(String[] args) {
        int x = args.length;
        System.out.println(x);
        if(checkLimit(x)) {
            System.out.println("JAVA SE");
        } else {
            System.out.println("JAVA EE");
        }
    }

    private static boolean checkLimit(int x) {
        return (x >= MIN) ? true : false;
    }

}
