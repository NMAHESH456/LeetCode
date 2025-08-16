package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
    public static void main(String args[]){
        String[] arr = {"mahesh","raz","sabu","mahesh","sridhar"};
        Set<String> set = new HashSet<>();
        for(String value : arr){
            set.add(value);
        }
//        String[] unique = new String[set.size()];
//        int i = 0;
//        for(String values : set){
//            unique[i++] = values;
//        }
        System.out.println("Original is : " + Arrays.toString(arr));
//        System.out.println("duplicate is : " + Arrays.toString(unique));
        System.out.println("After removing duplicates is : " +set);

    }
}
