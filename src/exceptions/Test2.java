package exceptions;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println("work real hard");
        } catch (StackOverflowError e) {
        } catch (RuntimeException e) {
        }
    }
}
