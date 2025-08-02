package DSA1.Arrays;
public class maxArray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];  
        int currentSum = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); 
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));           
        System.out.println(maxSubArray(new int[]{-3,-1,-2}));    }
}