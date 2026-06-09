package gratis;

public class Test61 {
    int count;

    public void displayMessage() {
        count++;
        System.out.println("Welcome "+"Visit Count: "+ count);
    }

    public static void main(String[] args) {
        Test61 test61 = new Test61();
//        Test61 test = new Test61();
        test61.displayMessage();
        test61.displayMessage();

//        Test61.displayMessage();
//        Test61.displayMessage();
    }
}
