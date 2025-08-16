package Arrays;

import java.util.Arrays;

public class MoveAllZeroesEnd {
    public static void moveZeroes(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
        public static void main(String args[]){
          int[] arr = {0,12,0,2,4,3,9}  ;
          moveZeroes(arr);
            System.out.println("output is :" + Arrays.toString(arr));

    }
}
