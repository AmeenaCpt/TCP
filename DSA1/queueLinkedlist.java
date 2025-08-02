package DSA1;
class queueLinkedlist {

    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Queue {
        Node front, rear;

        // Enqueue element to rear of queue
        void push(int x) {
            Node newNode = new Node(x);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        // Dequeue element from front
        int pop() {
            if (front == null) return -1;
            int popped = front.data;
            front = front.next;

            if (front == null) rear = null;
            return popped;
        }
    }

    // Test the queue
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(2);
        q.push(3);
        System.out.println(q.pop()); // Output: 2
        q.push(4);
        System.out.println(q.pop()); // Output: 3
        System.out.println(q.pop()); // Output: 4
        System.out.println(q.pop()); // Output: -1
    }
}
