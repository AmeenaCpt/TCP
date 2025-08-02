package DSA1.Stack;
import java.util.Stack;
import java.util.Arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        Stack<Integer> stack = new Stack<>(); // Stores indices

        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();

        int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dt.dailyTemperatures(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(result));
        // Expected Output: [1, 1, 4, 2, 1, 1, 0, 0]
    }
}

