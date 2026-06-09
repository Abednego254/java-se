package gratis;

public class Test67 {
    public static void main(String[] args) {

        int [] stack = { 10, 20, 30 };

        int size = 3;
        int idx= 0;
        // line 1

//        while (idx <= size - 1) { // 1st - idx = 0 <= 2  -> True   idx increments = 1
//            // 2nd iteration  idx = 1 <= 2   - True    idx = 2
//            // 3rd -  idx = 2 <= 2   -> True    => idx = 3
//            // 4th - idx = 3 <= 2   -> False    => exit the loop
//            idx++;
//        } //
//        do{
//            idx ++;
//        } while (idx <= size);

        do {
            idx++;
        } while (idx < size - 1);

        System.out.println("The top element is "+ stack[idx]);

//        do {
//            idx++;
//        } while (idx >= size);

//        while (idx < size) {
//            idx++;
//        }
    }
}
