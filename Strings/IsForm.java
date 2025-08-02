package Strings;
import java.util.*;
public class IsForm {
    public static void main(String[] args) {
        String s="silent";
        String t="listen";
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()!=t.length()){
            System.out.println("false");
        }
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        boolean IsForm=Arrays.equals(sArr, tArr);
        System.out.println(IsForm);


    }
}
