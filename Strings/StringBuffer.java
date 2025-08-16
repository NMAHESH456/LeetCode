package Strings;

public class StringBuffer {
    public static void main(String args[]){
        String s1 = "Mahesh";

            StringBuilder sb = new StringBuilder(s1);
//            sb.append(" Nayineni");

       // StringBuffer sb = new StringBuffer(s1);
        sb.append(" Nayineni");
            System.out.println("word is : " +sb.toString());
    }
}
