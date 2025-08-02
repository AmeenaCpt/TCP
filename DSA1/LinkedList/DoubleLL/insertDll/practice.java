package DSA1.LinkedList.DoubleLL.insertDll;
public class practice {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;
        public  ListNode(int data){
            this.data=data;
        }
    }
    public void display(){
        ListNode cNode=head;
        while(cNode!=null){
            System.out.print(cNode.data+"-->");
            cNode=cNode.next;
        }
        System.out.println("null");
    }
    public void insertBig(int data){
        ListNode newNode =new ListNode(data);
        if(head!=null){
            newNode.next=head;
            head.prev=newNode;
        }
        head=newNode;
    }
    public void insertEnd(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            newNode.next=head;
            head.prev=newNode;
            return;
        }
        ListNode cNode=head;
        while(cNode.next!=null){
            cNode=cNode.next;
        }
        cNode.next=newNode;
        newNode.prev=cNode;
    }
    public static void main(String[] args) {
        practice dll=new practice();
        dll.head=new ListNode(10);
        ListNode sNode=new ListNode(20);
        ListNode tNode=new ListNode(30);
        ListNode fNode=new ListNode(40);
        ListNode fiNode=new ListNode(50);
        dll.head.next=sNode;
        sNode.next=tNode;
        tNode.next=fNode;
        fNode.next=fiNode;
        dll.display();
        dll.insertBig(1);
        dll.display();
        dll.insertEnd(60);
        dll.display();
        
    }
}
