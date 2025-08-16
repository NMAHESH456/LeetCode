package Arrays;
import java.util.Arrays;
public class MoveZeroesLeft {
    public static void main(String args[]){
//        int[] arr = {1,2,0,0,3,0,2,0,2,0,0,2,03};
        int[] arr = {1, 0 , 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0};
        int ZeroesCount = 0;
        for(int num : arr){
            if(num == 0){
                ZeroesCount++;
            }
        }
        for(int i = 0; i< ZeroesCount; i++){
            arr[i] = 1;
        }

        for(int i = ZeroesCount; i<arr.length; i++){
            arr[i] = 0;
        }
        System.out.println("The array is  " +Arrays.toString(arr));
    }
}
