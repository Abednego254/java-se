package ExamTopics.arrays;

public class ArraysPlusDoWhile {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int i = 0;
        do {
            System.out.println(array[i] +" ");
            i++;
        } while (i < array.length + 1);

    }
}
