package ExamTopics.strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String str = "sweet sweat";
        String str1 = str.trim().charAt(6) +" " +str.indexOf("sw", 1);
        System.out.println(str1);
    }

}
