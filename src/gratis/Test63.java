//package gratis;
//
//import java.util.ArrayList;
//
//public class Test63 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(null);
////        list.remove(2);
//
//
////        System.out.println(list);
//
//        Integer s = list.get(4);
//        System.out.println(s);
//    }
//}

package gratis;

import java.util.ArrayList;

public class Test63 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add(null);

        String s = list.get(1);
        System.out.println(s.length()); // NullPointerException
    }
}
