package DSA1.LinkedList.SingleLL;
class practice{
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public  ListNode(int data){
            this.data=data;
        }
    }
    public void display(){
        ListNode cuNode=head;
        while(cuNode!=null){
            System.out.println(cuNode.data+"-->");
            cuNode=cuNode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        practice sll=new practice();
        sll.head=new ListNode(10);
        ListNode sNode=new ListNode(20);
        ListNode tNode=new ListNode(30);
        ListNode fNode=new ListNode(40);
        sll.head.next=sNode;
        sNode.next=tNode;
        tNode.next=fNode;
        sll.display();
    }
}