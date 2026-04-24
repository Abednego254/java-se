package ExamTopics.integers;

public class PassingIntegers {
    String myString = "7007";
    public void doStuff(String str) {
        int myNum = 0;
        try{
            String myString = str;
            myNum = Integer.parseInt(myString);
        } catch (NumberFormatException nfe) {
            System.err.println("Error");
        }
        System.out.println("myString: "+ myString +" myNum: "+ myNum);
    }

    public static void main(String[] args) {
        PassingIntegers passingIntegers = new PassingIntegers();
        passingIntegers.doStuff("9009");
    }
}
