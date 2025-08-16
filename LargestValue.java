package Arrays;

public class LargestValue {
    public static void main(String [] args){
        int [] arr = {12,13,2,123,43};
        int max = arr[0];
        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The largest element is "+max);
        System.out.println("The smallest element is "+min);

    }
}



//    public static void main(String args[]) {
//        int[] arr = {1, 2, 343, 422};
//        int max = arr[0];
//
//for(int i =0;i<arr.length;i++){
//    if(arr[i] > max);
//    max = arr[i];
//}
//
//        System.out.println("Max number is : " +max);
//    }
//}
//public class TwoLargestNumbers {
//    public static void main(String args[]) {
//        int[] arr = {1, 2, 343, 422, 50, 300};
//
//        int firstMax = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > firstMax) {
//                secondMax = firstMax;
//                firstMax = arr[i];
//            } else if (arr[i] > secondMax && arr[i] != firstMax) {
//                secondMax = arr[i];
//            }
//        }
//
//        System.out.println("Largest number is: " + firstMax);
//        System.out.println("Second largest number is: " + secondMax);
//    }
//}
