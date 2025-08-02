package DSA1.Arrays;

import java.util.*;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();

        int[] nums1a = {4, 1, 2};
        int[] nums2a = {1, 3, 4, 2};
        System.out.println("Output 1: " + Arrays.toString(obj.nextGreaterElement(nums1a, nums2a))); // [-1, 3, -1]

        int[] nums1b = {2, 4};
        int[] nums2b = {1, 2, 3, 4};
        System.out.println("Output 2: " + Arrays.toString(obj.nextGreaterElement(nums1b, nums2b))); // [3, -1]
    }
}

