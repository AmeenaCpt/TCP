package Patterns.Triangle;

public class Pascal {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            int x = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", x);
                x = x * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
}
