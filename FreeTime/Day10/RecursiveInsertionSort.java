package FreeTime.Day10;
import java.util.Arrays;

public class RecursiveInsertionSort {
    static void insertionSortRecursive(int arr[], int n) {
        if (n <= 1)
            return;
        insertionSortRecursive(arr, n - 1);
        int j = n - 1; 
        while (j > 0 && arr[j - 1] > arr[j]) { 
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        insertionSortRecursive(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
