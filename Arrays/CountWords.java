package Arrays;

public class CountWords {
    public static void main(String[] args) {
        String words = "Im working in manhattan associates";
//        int s1 =  words.split("\\s+").length;
String[] s1 = words.split("\\s+");
        System.out.println("Count of words is : " + s1.length);
        System.out.println("the  words are : " + Arrays.toString(s1));
    }

}

// Output :
// Count of words is : 5
// the  words are : [Im, working, in, manhattan, associates]

