package ExamTopics.list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.remove(2);
        colors.add(3,"Cyan");

        System.out.println(colors);
    }
}