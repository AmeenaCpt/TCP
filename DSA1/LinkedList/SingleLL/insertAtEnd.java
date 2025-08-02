package DSA1.LinkedList.SingleLL;

public class insertAtEnd {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        insertAtEnd sll=new insertAtEnd();
        sll.head=new ListNode(10);
        ListNode secNode=new ListNode(20);
        ListNode thNode=new ListNode(30);
        ListNode fNode=new ListNode(40);
        sll.head.next=secNode;
        secNode.next=thNode;
        thNode.next=fNode;
        sll.insertEnd(50);
        sll.display();
    }
    public void display(){
        ListNode cuNode=head;
        while(cuNode!=null){
            System.out.print(cuNode.data+"-->");
            cuNode=cuNode.next;
        }
        System.out.println("null");
    }
    public void insertEnd(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }else{
            ListNode cuNode=head;
            while(cuNode.next
            !=null){
                cuNode=cuNode.next;
            }
            cuNode.next=newNode;
        }

    }
}
