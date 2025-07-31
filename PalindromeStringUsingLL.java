public class PalindromeStringUsingLL {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void add(char data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public boolean isPalindrome() {
            if (head == null || head.next == null) {
                return true; // Single element or empty list is always a palindrome
            }

            // Step 1: Find the middle of the linked list
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse the second half of the linked list
            Node prev = null, curr = slow;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node secondHalf = prev; // Head of reversed second half
            Node firstHalf = head;

            // Step 3: Compare both halves
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false; // Not a palindrome
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true; // It is a palindrome
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('A');

        if (list.isPalindrome()) {
            System.out.println("Yes, It is a Palindrome");
        } else {
            System.out.println("No, It is not a Palindrome");
        }
}
}
