package DSA1.LinkedList.SingleLL;

public class insertAtBeg {
    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        insertAtBeg sll = new insertAtBeg();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = forth;
        sll.insertBeg(1); 
        sll.display();    
    }
    public void display() {
        ListNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
    public void insertBeg(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
}
