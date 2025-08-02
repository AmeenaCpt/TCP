package Patterns.LinkedList;
public class insertBeg {  
    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        insertBeg sll = new insertBeg(); 
        sll.head = new ListNode(10);    
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(4);
        sll.head.next = second;
        second.next = third;
        third.next = forth;
        sll.insertBeginning(15);
        sll.display();    
        sll.deleteAtBeg();
        sll.display();
    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void insertBeginning(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public ListNode deleteAtBeg(){
        if(head==null){
            return head;
        }else{
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
        }

    }
}
