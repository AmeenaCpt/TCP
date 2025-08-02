package DSA1.Arrays;
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return total - sum;
    }
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();

        int[] nums1 = {0, 1, 3};
        int[] nums2 = {3, 0, 1};
        int[] nums3 = {1};

        System.out.println("Missing number in [0, 1, 3]: " + obj.missingNumber(nums1)); // Output: 2
        System.out.println("Missing number in [3, 0, 1]: " + obj.missingNumber(nums2)); // Output: 2
        System.out.println("Missing number in [1]: " + obj.missingNumber(nums3));       // Output: 0
    }
}
