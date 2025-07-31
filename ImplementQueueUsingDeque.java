import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueueUsingDeque {
     static class Stack{
    Deque <Integer> d = new LinkedList<>();
    public void push(int data)
    {
        d.addLast(data);
    } 
    public int pop()
    {
        return d.removeFirst();
    } 
    public int peek()
    {
        return d.removeFirst();
    } 
}
public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(3);
    s.push(4);
    System.out.println(s.pop());
    System.out.println(s.peek());
}
}


