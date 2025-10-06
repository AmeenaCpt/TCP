package FreeTime.Day10;

public class RecursiveBubble {
    public static void sort(int[] a, int n) {
        if (n == 1)
            return;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        sort(a, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        sort(a, a.length);

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
