package Arrays;
import java.util.*;
//✅ Time Complexity: O(n)
// ✅ Space Complexity: O(1)
public class OddFirstEvenTwoPointers {
    public static void arrangedOddEvn(int[] num) {
        int[] result = new int[num.length];
        int left = 0, right = num.length - 1;
        while (left < right) {
            // Move left pointer until it finds an even number
            while (left < right && num[left] % 2 != 0) {
                left++;
            }
            // Move right pointer until it finds an odd number
            while (left < right && num[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr =  {5, 2, 8, 7, 1, 4, 9};
        arrangedOddEvn(arr);
        System.out.println("Odd First Even Next: " +  Arrays.toString(arr));
    }
}
