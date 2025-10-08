package FreeTime.Day12Arrays2;

public class SingleTime {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 4, 4};
        int n = a.length;
        if (n == 1) {
            System.out.println(a[0]);
            return;
        }
        for (int i = 0; i < n; i++) {
            // For the first element
            if (i == 0 && a[i] != a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
            // For the last element
            else if (i == n - 1 && a[i] != a[i - 1]) {
                System.out.println(a[i]);
                break;
            }
            // For middle elements
            else if (i > 0 && i < n - 1 && a[i] != a[i - 1] && a[i] != a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
