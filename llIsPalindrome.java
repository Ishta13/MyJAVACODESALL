public class llIsPalindrome {
    public class Node{
        int data;
        Node next; //this node next is imp
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public int size;
        // Method to add a new node at the beginning of the linked list
        public void addFirst(int data) {
            Node newNode = new Node(data); // Create a new node with given data
            size++;
            if (head == null) { // If the linked list is empty
                head = tail = newNode; // Both head and tail point to the new node
            } else {
                newNode.next = head; // New node's next points to the current head
                head = newNode; // Head now points to the new node
            }
        }
         // Method to add a new node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        size++;
        if (head == null) { // If the linked list is empty
            head = tail = newNode; // Both head and tail point to the new node
        } else {
            tail.next = newNode; // Current tail's next points to the new node
            tail = newNode; // Tail now points to the new node
        }
    }

    public void addAtMiddle(int index,int data) //data to inset and at wwhat index
    {
        Node newnode = new Node(data); //create newnode that should contain some data
        if(index==0)
        {
            addFirst(data);
            return;
        }
        size++; //addfirst ke baad me taaki add first me size++ repeat naa ho

        Node temp = head;
        int i=0;
        while(i<index-1) //previous (mtlb jis index ki jgh new node add krna vo) usse -1 index tk nhi pohoch jaate tbtk i++ temp.next
        {
            temp=temp.next;
            i++;
        } 
        newnode.next = temp.next; //jaise hi pohoche toh temp.next== newnode ka next taaki aage wale ele ko point kre
        temp.next = newnode; //aur temp hould now point to newnode

    }
    public int removeFirst()
    {
        if(size==0)
        {
           System.out.println("empty");
           return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head=tail=null;
            size=0; //size decrease to 0
            return val; //formality

        }
        int val = head.data; //as formality hmesha return value
        head = head.next; // head shift kro nrxt node pr
        size--;
        return val;
       

    }
    public int removeLast() {
        if (size == 0) {
            System.out.println("The list is empty.");
            return -12;  // Return a sentinel value indicating the list is empty
        }
        
        if (size == 1) {
            // If there's only one element, remove it and reset head and tail
            int val = head.data;
            head = tail = null;  // Set both head and tail to null as the list becomes empty
            size = 0;  // Reset the size
            return val;  // Return the data of the removed node
        }
        
        // Traverse the list to find the second-last node (prev)
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {  // Loop until the second-last node
            prev = prev.next;  // Move prev to the next node
        }
        
        // Now, prev points to the second-last node
        int val = tail.data;  // Store the tail's data
        prev.next = null;  // Remove the last node by setting prev.next to null
        tail = prev;  // Update the tail to point to the second-last node
        size--;  // Decrement the size as the last node is removed
        
        return val;  // Return the data of the removed tail node
    }
    public void key(int key)
    {
       Node temp=head;
       int i=0;
       while(temp!=null)
       {
        if(temp.data==key)
        {
            System.out.println(temp.data+" found at "+i);
            return;
        }
        temp=temp.next;
        i++;
       }
       System.out.println("not found");

    }
    public Node midnode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean palindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //Node mid= 
        Node curr = midnode(head);
        Node prev= null;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        Node left = head;
        Node right = prev;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    
        // Method to print the linked list
        public void print() {
            Node temp = head; // Start from the head (to traverse list)
            while (temp != null) { // Traverse until the end of the list
                System.out.print(temp.data + "->"); // Print current node's data
                temp = temp.next; // Move to the next node to print next node's data
            }
            System.out.println("null"); // Indicate the end of the list
        }
    public static void main(String[] args) {
        llIsPalindrome ll = new llIsPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.palindrome());
       
    }


}

