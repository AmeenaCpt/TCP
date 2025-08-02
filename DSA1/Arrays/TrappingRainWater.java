package DSA1.Arrays;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater obj = new TrappingRainWater();

        int[] test1 = {0,1,0,2,1,0,1,3,2,1,2,1}; // Expected: 6
        int[] test2 = {4,2,0,3,2,5};             // Expected: 9
        int[] test3 = {3,3,3};                   // Expected: 0

        System.out.println("Trapped water in test1: " + obj.trap(test1));
        System.out.println("Trapped water in test2: " + obj.trap(test2));
        System.out.println("Trapped water in test3: " + obj.trap(test3));
    }
}

