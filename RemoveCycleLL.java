public class RemoveCycleLL {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public  Node head = null;
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
    public void removeCycle()
    {
        Node slow=head;
        Node fast=head;
        boolean iscycle = false;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
             iscycle = true;
             break;  //taaki vhi ruk jaaye jaise hi vo node mile jisse infinite loop
            }
        }
        if(iscycle==false)
        {
            return; //return to the function
        }
        // to do the remove cycle 
        slow=head; //again put slow = head
        Node prev = null;
        while(slow!=fast)
        {
            prev=fast; //do the remove function thing
            slow=slow.next; //do the remove cycle
            fast=fast.next; //do the remove cycle
        }
        prev.next=null; //taaaki vo node delete jo prev ke baad wali to remove cycle

    }
    public static void main(String[] args) {
        RemoveCycleLL ll = new RemoveCycleLL();
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle (4 → 2)

        System.out.println("Cycle detected? " + ll.iscycle());

        ll.removeCycle();

        System.out.println("Cycle detected after removal? " + ll.iscycle());

    }
}
