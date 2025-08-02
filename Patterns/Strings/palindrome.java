package Patterns.Strings;

public class palindrome {
    public static String reverse(String s) {
        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);  
            r = ch + r;        
        }
        return r;  
    }
    public static void main(String[] args) {
        String s="madam";
        String reveString=reverse(s);
        System.out.println(reveString);
        System.out.println(s);
        if(reveString.equals(s)){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
