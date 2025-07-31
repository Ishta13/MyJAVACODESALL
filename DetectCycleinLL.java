public class DetectCycleinLL {
    public class Node{
        int data;
        Node next;
        public Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public boolean iscycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }

        } 
        return false;
    }
    public static void main(String[] args) {
        DetectCycleinLL ll = new DetectCycleinLL();
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);
        ll.head.next.next = ll.new Node(3);
        ll.head.next.next.next= ll.head.next;
        System.err.println(ll.iscycle());

        
    }

    
}
