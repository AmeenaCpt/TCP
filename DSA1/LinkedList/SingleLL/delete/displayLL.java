package DSA1.LinkedList.SingleLL.delete;
public class displayLL {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode (int data){
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
    public static void main(String[] args) {
        displayLL sll=new displayLL();
        sll.head=new ListNode(10);
        ListNode snode=new ListNode(20);
        ListNode tNode=new ListNode(30);
        ListNode fNode=new ListNode(40);
        sll.head.next=snode;
        snode.next=tNode;
        tNode.next=fNode;
        sll.display();
        sll.deleteAtBeg();
        sll.display();
        sll.deleteAtEnd();
        sll.display();
        sll.deleteAtPosition(1);
        sll.display();
    }
    public ListNode deleteAtBeg(){
        if(head==null){
            return head;
        }else{
            ListNode temp=head;
            head=temp.next;
            temp.next=null;
            return temp;
        }
    }
    public ListNode deleteAtEnd(){
        if(head==null || head.next==null){
            ListNode temp=head;
            head=null;
            return temp;
        }else{
            ListNode cNode=head;
            ListNode pNode=null;
            while(cNode.next!=null){
                pNode=cNode;
                cNode=cNode.next;
            }
            pNode.next=null;
            return cNode;
        }
    }
    public void deleteAtPosition(int position) {
    if (head == null || position <= 0) {
        System.out.println("Invalid position or empty list.");
        return;
    }
    if (position == 1) {
        head = head.next;
        return;
    }
    ListNode current = head;
    ListNode previous = null;
    int count = 1;

    while (current != null && count < position) {
        previous = current;
        current = current.next;
        count++;
    }

    if (current == null) {
        System.out.println("Position out of bounds.");
        return;
    }

    previous.next = current.next;
}

}
