//package gratis;
//
//public class Test70 {
//
//    public static void main(String[] args) {
//
//        int[] data = { 2010, 2013, 2014, 2015, 2014 };
//        int key = 2014;
//        int count = 0;
//
//        for (int e : data) {
//            if (e !=  key) {
////                count++;
//                continue;
//            }
//        }
//    }
//}

package gratis;

public class Test70 {

    public static void main(String[] args) {

        int[] data = { 2010, 2013, 2014, 2015, 2014 };
        int key = 2014;
        int count = 0;

        for (int e : data) {
            if (e != key) {
                System.out.println("Not key");
                continue; // Skip non-matching elements
            }

            count++; // Executed only when e == key
        }

        System.out.println("Count = " + count);
    }
}
