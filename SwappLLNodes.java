public class SwappLLNodes {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

   public Node swap(Node head,int k)
   {
     Node slow=head;
      Node fast=head;
      while(--k>0)
      {
        if(slow==null||slow.next==null)   ///if empty /////can take both fast and slow
        {
            return head;
        }
        fast=fast.next;
      }
      Node first=fast;
      while(fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next;
      }
      ///swap(first.data,slow.data); not allowed in javaa
      int temp=first.data;
      first.data=slow.data;
      slow.data=temp;
      return head;

   }
   public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}
   public static void main(String[] args) {
    SwappLLNodes list = new SwappLLNodes();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Original List:");
        list.printList();

        // Swapping 2nd node from start and end
        list.swap(list.head, 2);

        System.out.println("List after swapping 2nd node from start and end:");
        list.printList();
    
   }
    
}
