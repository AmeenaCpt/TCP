package DSA1.Stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
        int size = q.size();
        while (size-- > 1) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.top()); // Output: 2
        System.out.println("Popped element: " + stack.pop()); // Output: 2
        System.out.println("Is stack empty? " + stack.empty()); // Output: false

        stack.push(3);
        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 1
        System.out.println("Is stack empty? " + stack.empty()); // Output: true
    }
}
