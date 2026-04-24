public class Main {
    public static void main(String[] args) {
//        int x = 5;
//        if(x == 5) {
//            System.out.println("Equal");
//        }

//        int i = 1;
//
//        while(i <= 5) {
//            if(i == 3) {
//                i++;
//                continue;
//            }
//            System.out.print(i + " ");
//            i++;
//        }
//        String s1 = "Java";
//        String s2 = "Java";
//
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

//        int i = 1;

//        while(i < 5);
//        {
//            System.out.println(i);
//            i++;
        int[] arr = { 12, 4, 7, 1, 9};
        int smallestNumber = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallestNumber) {
                System.out.println(i);
            }
        }
    }
}