package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesArray {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,3,3};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
//        int[] unique = new int[set.size()];
//        int i = 0;
//        for(int num : set){
//            unique[i++] = num;
//        }
        System.out.println("Original is : " +Arrays.toString(arr));
//        System.out.println("duplicate is : " + Arrays.toString(unique));
        System.out.println("After removing duplicates is : " +set);


    }
}
