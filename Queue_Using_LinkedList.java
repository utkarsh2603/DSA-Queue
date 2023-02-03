import jdk.swing.interop.SwingInterOpUtils;

public class Queue_Using_LinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    static class Queue
    {
        public static Node head;
        public static Node tail;

        //isEmpty
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }

        //add
        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int front=head.data;
            if(tail==head)
            {
                head=tail=null;
            }
            else {
                head = head.next;
            }
            return front;

        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
