package Strings;

public class FirstOccurSubStringSimple {
    public static void main(String args[]){
        String str = "Mahesh";
        String str1 = "he";

        int index = str.indexOf(str1);
        System.out.println("First occurrence of \"" + str1 + "\" is at index: " + index);
    }
}
