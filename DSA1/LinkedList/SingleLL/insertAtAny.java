package DSA1.LinkedList.SingleLL;

public class insertAtAny {
    private ListNode head;
    public class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        insertAtAny sll = new insertAtAny();
        sll.head = sll.new ListNode(10);
        ListNode sNode = sll.new ListNode(20);
        ListNode tNode = sll.new ListNode(40);
        ListNode fNode = sll.new ListNode(50);
        sll.head.next = sNode;
        sNode.next = tNode;
        tNode.next = fNode;
        sll.insertAny(3, 30); // Insert 30 at position 3
        sll.display();
    }
    public void display() {
        ListNode cNode = head;
        while (cNode != null) {
            System.out.print(cNode.data + " --> ");
            cNode = cNode.next;
        }
        System.out.println("null");
    }
    public void insertAny(int pos, int value) {
        ListNode newNode = new ListNode(value);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode prNode = head;
            int count = 1;

            while (count < pos - 1 && prNode != null) {
                prNode = prNode.next;
                count++;
            }

            if (prNode == null) {
                System.out.println("Position out of bounds");
                return;
            }

            newNode.next = prNode.next;
            prNode.next = newNode;
        }
    }
}
