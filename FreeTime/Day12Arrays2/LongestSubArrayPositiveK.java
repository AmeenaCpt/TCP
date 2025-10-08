package FreeTime.Day12Arrays2;

public class LongestSubArrayPositiveK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int maxLen = 0;
        // check every subarray
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        System.out.println("Length of longest subarray = " + maxLen);
    }
}
