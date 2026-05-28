package ExamTopics.strings;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JAVA");
        String s = "JAVA";
        if(sb.toString().equals(s.toString())){
            System.out.println("Match 1");
        } else if (sb.equals(s)) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
    }
}
