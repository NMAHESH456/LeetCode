package Strings;

public class ReverseStringBuilder {
    public static void main(String args[]) {
        //String s1 = "Mahesh";
        String s2 = "Hello nayineni mahesh";
        //Stringbuilder
        StringBuilder sb = new StringBuilder(s2);

        //String buffer
//        StringBuffer sb = new StringBuffer(s2);
        sb.reverse();
        System.out.println("The reverse word is : " +sb.toString());
    }
}
