package SerachingTechniques;

import java.util.Scanner;
import java.util.Arrays;

public class practice1 {

    // Binary search method
    public static int search(int[] a, int k) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == k) {
                return mid; // Found at index mid
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array before binary search
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));

        // Input element to search
        System.out.print("Enter element to search: ");
        int k = sc.nextInt();

        // Search
        int result = search(a, k);
        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at index " + result);
        }

        sc.close();
    }
}
