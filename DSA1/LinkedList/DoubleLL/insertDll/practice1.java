package DSA1.LinkedList.DoubleLL.insertDll;

public class practice1 {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
        }
    }

    // Display in forward direction
    public void display() {
        ListNode cNode = head;
        while (cNode != null) {
            System.out.print(cNode.data + " --> ");
            cNode = cNode.next;
        }
        System.out.println("null");
    }

    // Insert at beginning
    public void insertBig(int value) {
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
            head = newNode;  // ✅ fixed: just set head = newNode
            return;
        }
        ListNode cNode = head;
        while (cNode.next != null) {
            cNode = cNode.next;
        }
        cNode.next = newNode;
        newNode.prev = cNode;
    }

    public static void main(String[] args) {
        practice1 dll = new practice1();

        // Manually create and link nodes with prev also
        dll.head = new ListNode(1);
        ListNode sNode = new ListNode(2);
        ListNode tNode = new ListNode(3);
        ListNode fiNode = new ListNode(4);

        // Forward linking
        dll.head.next = sNode;
        sNode.next = tNode;
        tNode.next = fiNode;

        // Backward linking
        sNode.prev = dll.head;
        tNode.prev = sNode;
        fiNode.prev = tNode;

        // Display original list
        dll.display();  // 1 --> 2 --> 3 --> 4 --> null

        // Insert at beginning
        dll.insertBig(0);
        dll.display();  // 0 --> 1 --> 2 --> 3 --> 4 --> null

        // Insert at end
        dll.insertEnd(5);
        dll.display();  // 0 --> 1 --> 2 --> 3 --> 4 --> 5 --> null
    }
}
