package Patterns.LinkedList;



public class insertEnd {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        insertEnd sll=new insertEnd();
        sll.head=new ListNode(5);
        ListNode secNode=new ListNode(6);
        ListNode thListNode=new ListNode(7);
        ListNode fNode=new ListNode(8);
        sll.head.next=secNode;
        secNode.next=thListNode;
        thListNode.next=fNode;
        sll.insertAtEnd(10);
        sll.display();
        sll.deleteAtEnd();
        sll.display();
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertAtEnd(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
             head=newNode;
        }else{
            ListNode current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public ListNode deleteAtEnd(){
        if(head==null || head.next==null){
            return head;
        }else{
            ListNode curNode=head;
            ListNode prListNode=null;
            while(curNode.next!=null){
                prListNode=curNode;
                curNode=curNode.next;
            }
            prListNode.next=null;
            return curNode;
        }
    }
}
