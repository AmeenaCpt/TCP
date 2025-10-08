package FreeTime.Day12Arrays2;
import java.util.HashMap;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: subarray starts from index 0
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray in between
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println(longestSubarray(nums1, k1)); // Output: 4

        int[] nums2 = {-3, 2, 1};
        int k2 = 6;
        System.out.println(longestSubarray(nums2, k2)); // Output: 0

        int[] nums3 = {-1, 1, 1};
        int k3 = 1;
        System.out.println(longestSubarray(nums3, k3)); // Output: 2
    }
}
