package DSA1;
public class KthFromEnd {

    // Node class
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // Method to find k-th node from the end
    public static int getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        // Move fast k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1; // k > length
            fast = fast.next;
        }

        // Move both pointers till fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return (slow != null) ? slow.data : -1;
    }

    // Helper method to build list from array
    public static ListNode buildList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Test the solution
    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k1 = 2;
        ListNode head1 = buildList(values1);
        System.out.println(getKthFromEnd(head1, k1)); // Output: 8

        int[] values2 = {10, 5, 100, 5};
        int k2 = 5;
        ListNode head2 = buildList(values2);
        System.out.println(getKthFromEnd(head2, k2)); // Output: -1
    }
}
