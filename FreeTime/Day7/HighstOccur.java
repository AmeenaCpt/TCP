package FreeTime.Day7;
import java.util.*;

class HighstOccur {
    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find element with max frequency
        int mostFrequent = nums[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        System.out.println(mostFrequentElement(nums)); // Output: 3
    }
}
