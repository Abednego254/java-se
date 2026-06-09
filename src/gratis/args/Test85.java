package gratis.args;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test85 {
    public static void main(String[] args) {

    String[] array = { "Hi", "How", "Are", "You" };
    List<String> list = new ArrayList<>(Arrays.asList(array));

    if (list.removeIf((String s) -> s.length() >= 2)) {
        System.out.println(list);
        }
    }
}
