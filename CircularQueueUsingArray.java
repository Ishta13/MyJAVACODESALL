import java.util.*;
public class CircularQueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n)
        {
            arr = new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;   //////fulll
        }
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("queue is full");
                return;
            }
            if(front==-1)
            {
                front=0; //////initialize to add
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue empty");
                return -1;
            }
            int ele=arr[front]; //////store it before front==rear otherwise error
            if(front==rear)  //////////one ele
            {
                front=rear=-1;
            }
          
            front=(front+1)%size;
            return ele;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue  q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
            if (!q.isEmpty()) { // Check before calling peek()
                System.out.println(q.peek());
            }
        }
    }
}
