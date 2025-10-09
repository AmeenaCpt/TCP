package FreeTime.Day13ArraysMedium;

import java.util.ArrayList;

public class RearrangeSign {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, -1, -2, -3};
        int n = a.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                pos.add(a[i]);
            } else {
                neg.add(a[i]);
            }
        }

        int[] temp = new int[n];
        int k = 0;  // pointer for temp array

        // Merge alternately
        for (int i = 0; i < pos.size(); i++) {
            temp[k++] = pos.get(i);  // get positive element
            temp[k++] = neg.get(i);  // get negative element
        }

        // Print the rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
