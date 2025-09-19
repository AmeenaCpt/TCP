public class Palindrome {
    static int rem = 0; 
    static int original; 
    static void reverse(int n) {
        if (n == 0) return;   
        int digit = n % 10;
        rem = rem * 10 + digit;
        reverse(n / 10);
    }
    public static void main(String[] args) {
        int n = 123;
        original = n;
        reverse(n);
        if (original == rem) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
