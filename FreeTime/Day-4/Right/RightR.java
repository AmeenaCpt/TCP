public class RightR {
    public static void draw(int n) {
        for (int i = 0; i < n; i++) {
            // spaces first
            for (int j = i; j < n - 1; j++) {
                System.out.print("  "); 
            }
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(6);
    }
}
