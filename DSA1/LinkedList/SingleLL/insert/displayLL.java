package DSA1.LinkedList.SingleLL.insert;

public class displayLL {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
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
    public static void main(String[] args) {
        displayLL sll=new displayLL();
        sll.head =new ListNode(10);
        ListNode sNode=new ListNode(20);
        ListNode tNode=new ListNode(30);
        ListNode fNode=new ListNode(40);
        sll.head.next=sNode;
        sNode.next=tNode;
        tNode.next=fNode;
        sll.display();
        sll.insertAtBeg(5);
        sll.display();
        sll.insertAtEnd(50);
        sll.display();
        sll.insertAtAny(3, 35);
        sll.display();

    }
    public void insertAtBeg(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int value){
        ListNode newNode =new ListNode(value);
        if (head==null){
            head=newNode;
        }else{
            ListNode cuNode=head;
            while(cuNode.next!=null){
                cuNode=cuNode.next;
            }
            cuNode.next=newNode;
        }
    }
    public void insertAtAny(int pos,int value){
        ListNode newNode =new ListNode(value);
        if(pos==1){
            newNode.next=head;
            head=newNode;
        }else{
            ListNode pNode=head;
            int count=1;
            while(count<pos-1 && pNode!=null){
                pNode=pNode.next;
                count++;
            }
            if(pNode==null){
                System.out.println("Position outof Bound");
            }
            newNode.next=pNode.next;
            pNode.next=newNode;
        }
    }
}
