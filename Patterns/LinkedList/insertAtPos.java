package Patterns.LinkedList;

public class insertAtPos {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        insertAtPos sll=new insertAtPos();
        sll.head=new ListNode(1);
        ListNode sNode=new ListNode(2);
        ListNode tNode=new ListNode(3);
        ListNode fNode=new ListNode(5);
        sll.head.next=sNode;
        sNode.next=tNode;
        tNode.next=fNode;
        sll.insertAtPosition(4,4);
        sll.display();
        sll.dListNode(3);
        sll.display();
    }
    public void display(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertAtPosition(int position,int value){
        ListNode newNode=new ListNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        else{
            ListNode prNode=head;
            int count=1;
            while(count<position-1){
                prNode=prNode.next;
                count++;
            }
            
            newNode.next=prNode.next;
            prNode.next=newNode;
        }
    }
    public void dListNode(int position){
        if(head==null||position<=1){
            System.out.println("Invalid Position");
            return ;
        }
        if(position==1){
            head=head.next;
            return;
        }
        ListNode prListNode=head;
        int count=1;
        while(count<position-1 && prListNode.next!=null){
                prListNode=prListNode.next;
                count++;
            }
            prListNode.next=prListNode.next.next;
        }
}
