package FreeTime.Day13ArraysMedium;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 3, 4, 7, 1};
        int n = a.length;

        // Step 1: Frequency array
        int[] hash = new int[100];  // Works if elements < 100

        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        // Step 2: Find majority element
        int majority = -1;
        for (int i = 0; i < n; i++) {
            if (hash[a[i]] > n / 2) {
                majority = a[i];
                break;
            }
        }

        // Step 3: Print result
        System.out.println("Majority element is: " + majority);
    }
}
