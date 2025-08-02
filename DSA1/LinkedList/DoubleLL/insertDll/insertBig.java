package DSA1.LinkedList.DoubleLL.insertDll;

public class insertBig {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
        }
    }

    // Display forward
    public void display() {
        ListNode cNode = head;
        while (cNode != null) {
            System.out.print(cNode.data + " <-> ");
            cNode = cNode.next;
        }
        System.out.println("null");
    }

    // Display in reverse
    public void displayReverse() {
        if (head == null) return;

        // Go to last node
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Print from last to head
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Insert at beginning
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert after a specific key
    public void insertAfter(int key, int value) {
        ListNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found.");
            return;
        }

        ListNode newNode = new ListNode(value);
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public static void main(String[] args) {
        insertBig dll = new insertBig();

        // Using insertEnd
        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertEnd(40);

        // Using insertFirst
        dll.insertFirst(5);

        // Insert after a key
        dll.insertAfter(20, 25); // insert 25 after 20

        // Display forward
        System.out.println("Forward:");
        dll.display(); // Output: 5 <-> 10 <-> 20 <-> 25 <-> 30 <-> 40 <-> null

        // Display reverse
        System.out.println("Reverse:");
        dll.displayReverse(); // Output: 40 <-> 30 <-> 25 <-> 20 <-> 10 <-> 5 <-> null
    }
}
