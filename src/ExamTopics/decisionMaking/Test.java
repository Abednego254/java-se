package ExamTopics.decisionMaking;

public class Test {
    public static void main(String[] args) {
        String stuff = "Movie";
        String res = null;

        res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie")
                ? "White" : "No Result";
        System.out.println(res);
    }
}
