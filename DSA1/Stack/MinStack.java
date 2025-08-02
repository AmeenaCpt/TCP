package DSA1.Stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(3);

        System.out.println("Current Min: " + minStack.getMin()); // Output: 3
        minStack.pop(); // Popping one 3
        System.out.println("Current Top: " + minStack.top());   // Output: 7
        System.out.println("Current Min: " + minStack.getMin()); // Output: 3
        minStack.pop(); // Popping 7
        minStack.pop(); // Popping remaining 3
        System.out.println("Current Min: " + minStack.getMin()); // Output: 5
    }
}
