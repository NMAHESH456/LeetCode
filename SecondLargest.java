package Arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String args[]){
        int arr[] = {1,22,43,45,222};
        int max = arr[0];
        int min = arr[0];
        int secondMax = arr[0];
        int thirdMAx = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                thirdMAx = secondMax;
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
            else if(arr[i] > thirdMAx && arr[i] != secondMax && arr[i] != max){
                thirdMAx = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The largest value is " +max);
        System.out.println("The second largest value is " +secondMax);
        System.out.println("The third largest value is " +thirdMAx);
        System.out.println("The smallest value is " +min);
        System.out.println("The original value is " + Arrays.toString(arr));

    }
}
