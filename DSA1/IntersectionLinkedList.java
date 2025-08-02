package DSA1;
public class IntersectionLinkedList {
    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;
        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;
        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.data);
        } else {
            System.out.println("No intersection.");
        }
    }
}
