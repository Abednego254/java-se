package gratis.BrainDumbs;

import java.util.Arrays;

public class Test48 {
    public static void main(String[] args) {
        int [] intArray = { 15, 30, 45, 60, 75 };
        intArray[2] = intArray[4];
        intArray[4] = 90;

        System.out.println(Arrays.toString(intArray));
    }
}
