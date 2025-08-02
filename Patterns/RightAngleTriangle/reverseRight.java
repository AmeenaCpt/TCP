package Patterns.RightAngleTriangle;

public class reverseRight {
    public static void printPattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                if (k == 0 || k == (2 * i) || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=6;
        printPattern(n);
    }
}
