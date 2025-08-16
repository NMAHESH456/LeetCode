package Arrays;

public class MissingNumber {
    public static int missingNumber(int[] arr){
    int n = arr.length;
    int expectedSum = n *(n+1)/2;
    int actualSum = 0;
    for(int num : arr){
        actualSum = actualSum + num;
    }
        return expectedSum - actualSum;
    }
    public static void main(String args[]){
        int[] arr = {0,1,3,4,5};
        System.out.println("The missing number is :" +missingNumber(arr));
    }
}
