package Strings;
import java.util.*;
public class LongestSubString {
//    public static int longestSubString(String s) {
//        int n = s.length();
//        int left = 0;
//        int right = 0;
//        int maxLength = 0;
//
//        HashSet<Character> set = new HashSet<>();
//
//        while (right < n) {
//            if(!set.contains(s.charAt(right))){
//                set.add(s.charAt(right));
//                right++;
//                maxLength = Math.max(maxLength, right - left);
//
//            }
//            else {
//                set.remove(s.charAt(right));
//                left++;
//            }
//        }
//        return  maxLength;
//
//    }

    public static int longestSubString(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
return maxLength;
    }
    public static void main(String args[]){
        String input = "mahesh";
        System.out.println("The longest substring is : " + longestSubString(input));
    }

}
