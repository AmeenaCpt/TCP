package DSA1.Strings;
public class StringProblems {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void testReverseString() {
        System.out.println(reverseString("hello"));     
        System.out.println(reverseString("racecar"));   
        System.out.println(reverseString(""));          
    }
}