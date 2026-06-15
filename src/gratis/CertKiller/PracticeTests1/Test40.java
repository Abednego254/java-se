package gratis.CertKiller.PracticeTests1;

public class Test40 {
    String myStr = "7007";

    public void doStuff(String str) {
        int myNum =  0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException e) {
            System.err.println("Error");
        }
        System.out.println("myStr = " + myStr + " myNum = " + myNum);
    }

    public static void main(String[] args) {
        Test40 myTest = new Test40();
        myTest.doStuff("9009");
    }
}