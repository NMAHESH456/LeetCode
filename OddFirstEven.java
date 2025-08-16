package Arrays;

import java.util.Arrays;
//Time Complexity
//        First loop → O(n)
//        Second loop → O(n)
//        Total → O(n) + O(n) = O(2n) → simplified to O(n)
//Space Complexity
//        You’re creating a new result[] array → O(n) extra space.

public class OddFirstEven {
    public static int[] arrangedOddEven(int[] num){
        int[] result = new int[num.length];
        int index = 0;
//Add odd numbers first
        for(int n : num){
            if(n % 2 != 0){
                result[index++] = n;
            }
        }
        for(int n : num){
            if(n % 2 == 0){
                result[index++] = n;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 4, 9};

        int[] result = arrangedOddEven(arr);
        System.out.println("Odd First Even Next : " + Arrays.toString(result));
    }
}
