package ExamTopics.strings;

public class Sbuilder {
    public static void main(String[] args) {
        StringBuilder sObj = new StringBuilder("Java");
        System.out.println(sObj.indexOf("the"));
        sObj.append("the great");
        System.out.println(sObj.indexOf("the"));
    }
}
