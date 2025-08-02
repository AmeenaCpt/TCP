package DSA1.Strings;
public class StringCompression {
    public static String compressString(String s) {
        if (s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void testStringCompression() {
        System.out.println(compressString("aabcccccaaa"));  // a2b1c5a3
        System.out.println(compressString("abc"));          // a1b1c1
        System.out.println(compressString(""));             // (empty)
        System.out.println(compressString("aa"));           // a2
    }

    public static void main(String[] args) {
        testStringCompression();
    }
}
