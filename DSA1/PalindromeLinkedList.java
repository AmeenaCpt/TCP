package DSA1;
public class PalindromeLinkedList {

    // Node class
    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }

    // Function to check if the linked list is palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Helper method to reverse a linked list
    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Test the function
    public static void main(String[] args) {
        // Example 1: Palindrome
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(1);

        System.out.println("Output: " + (isPalindrome(head1) ? 1 : 0));  // Output: 1

        // Example 2: Not a palindrome
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.println("Output: " + (isPalindrome(head2) ? 1 : 0));  // Output: 0
    }
}
