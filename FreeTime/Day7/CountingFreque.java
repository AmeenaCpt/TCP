package FreeTime.Day7;
import java.util.*;

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        List<List<Integer>> ans = sol.countFrequencies(a);
        System.out.println(ans);
        sc.close();
    }
}
