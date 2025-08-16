package Arrays;
import java.util.Arrays;
public class MoveZeroesMorethanOne {
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 0, 3, 0, 2, 0, 2, 0, 0, 2, 03};

        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int num : arr) {
            if (num == 0) {
                result[left++] = 0;         // 0s go to the left
            } else {
                result[right--] = num;      // all non-zeros go to the right
            }
        }

        // Reverse the right part to fix order of non-zeros
        int i = left;
        int j = arr.length - 1;
        while (i <j) {
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i++;
            j--;
        }

        System.out.println("Result: " + Arrays.toString(result));
    }
}


