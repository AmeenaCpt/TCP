package DSA1;
class popPop{

    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Stack {
        Node top = null;

        // Push element onto stack
        void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
        }

        // Pop element from top of stack
        int pop() {
            if (top == null) return -1;
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    // Test the stack
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        System.out.println(s.pop()); // Output: 3
        s.push(4);
        System.out.println(s.pop()); // Output: 4
    }
}
