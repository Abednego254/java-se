package ExamTopics.exceptions;

import java.io.IOException;

public class X {
    public void printFileContent() throws IOException {

        throw new IOException("Exception Raised");
    }

    public static void main(String[] args) throws IOException {
        X obj = new X();
        obj.printFileContent();
    }
}
