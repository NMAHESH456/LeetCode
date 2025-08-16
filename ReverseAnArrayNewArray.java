package Arrays;

import java.util.Arrays;

public class ReverseAnArrayNewArray {
    public static int[] arrayReverse(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] result = arrayReverse(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("Reverse array is : " + Arrays.toString(result));
    }
}
