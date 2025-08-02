package Arrays;

import java.util.Scanner;

public class AddTwo {
    public static boolean addTwo(int[] a, int key) {
        boolean isFound = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == key) {
                    System.out.println("[" + i + ", " + j + "]");
                    isFound = true;
                }
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter key (target sum): ");
        int key = sc.nextInt();
        boolean result = addTwo(a, key);
        if (result) {
            System.out.println("Elements Found");
        } else {
            System.out.println("Elements Not Found");
        }

        sc.close();
    }
}
