package DSA1.Arrays;


public class SubarraySum {
    public static String findSubarray(int[] arr, int sum) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > sum && start < end) {
                currentSum -= arr[start++];
            }

            if (currentSum == sum) {
                return "(" + start + ", " + end + ")";
            }
        }

        return "-1";
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int sum1 = 12;
        System.out.println("Subarray indices for sum 12: " + findSubarray(arr1, sum1)); // Output: (2, 4)

        int[] arr2 = {1, 2, 3, 4, 5};
        int sum2 = 9;
        System.out.println("Subarray indices for sum 9: " + findSubarray(arr2, sum2)); // Output: (1, 3)

        int[] arr3 = {1, 2, 3};
        int sum3 = 7;
        System.out.println("Subarray indices for sum 7: " + findSubarray(arr3, sum3)); // Output: -1
    }
}
