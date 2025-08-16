package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseArray {
//    public static void main(String args[]){
//      int []  Arr = {1,2,3,4,5};
//      int left = 0;
//      int right= Arr.length -1;
//
//      while(left < right) {
//          int temp = Arr[left];
//          Arr[left] = Arr[right];
//          Arr[right] = temp;
//
//          left++;
//          right--;
//      }
//          for(int num : Arr){
////              System.out.println("The reversed number is" +num );
//              System.out.println(num + " ");
//
//          }
//
//    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int left= 0;
        int right = arr.length -1;

        while(left <right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
//        for(int i =0;i < arr.length  ; i++){
//            System.out.println(arr[i] + "");
//
//        }
        System.out.println(Arrays.toString( arr));

    }
}
