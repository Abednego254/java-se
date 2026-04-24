package ExamTopics.exceptions;

import java.io.IOException;

public class X {
    public void printFileContent() throws IOException{

        throw new IOException();
    }

    public static void main(String[] args) throws Exception {
        X obj = new X();
        obj.printFileContent();
    }
}
