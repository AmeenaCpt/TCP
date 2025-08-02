package DSA1;
public class ReverseLinkedList {  
    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        ReverseLinkedList sll = new ReverseLinkedList(); 
        sll.head = new ListNode(10);    
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(4);
        sll.head.next = second;
        second.next = third;
        third.next = forth;
        System.out.println("Original list:");
        sll.display();
        sll.head = sll.reverse(sll.head);
        System.out.println("Reversed list:");
        sll.display();
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; 
    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
