package DSA1.Stack;


import java.util.Stack;

class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek(); // Ensure output is ready
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println("Peek: " + queue.peek()); // Output: 1
        System.out.println("Pop: " + queue.pop());   // Output: 1
        System.out.println("Is Empty? " + queue.empty()); // Output: false
        queue.push(3);
        System.out.println("Peek: " + queue.peek()); // Output: 2
        System.out.println("Pop: " + queue.pop());   // Output: 2
        System.out.println("Pop: " + queue.pop());   // Output: 3
        System.out.println("Is Empty? " + queue.empty()); // Output: true
    }
}
