package Patterns.Strings;
class ReverseString {
    public static String reverse(String s) {
        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);  
            System.out.println(ch);
            r = ch + r;        
            System.out.println(r);
        }
        return r;  
    }

    public static void main(String[] args) {
        String s = "Geeks";
        String reversedString = reverse(s);
        
        System.out.println("Reversed String: " + reversedString);
    }
}
