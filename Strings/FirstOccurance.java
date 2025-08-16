package Strings;

//import java.lang.classfile.attribute.ModuleResolutionAttribute;

public class FirstOccurance {
    public int strstr(String haystack, String needle){
        int hlen = haystack.length();
        int nlen = needle.length();

        if(nlen == 0){
            return 0;
        }

for(int i = 0; i <= hlen - nlen; i++){
    if(haystack.substring(i,i+nlen).equals(needle)){
        return i;
    }
}
return -1;
    }
    public static void main(String args[]){
        FirstOccurance s = new FirstOccurance();
        System.out.println(s.strstr("hello", "ll"));
    }
}
