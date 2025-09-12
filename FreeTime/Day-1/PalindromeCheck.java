public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "level";
        String reversed = "";

        // Reverse manually
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Compare
        if (str.equals(reversed)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}
