package Strings;

public class ReverseWords {
    public static void main(String args[]){
        String s1 = "hello mahesh nayieneni";
        String[] words = s1.split(" ");

        for(int i = words.length -1; i >=0; i--){
            System.out.print( words[i] + " ");
        }
    }
}
