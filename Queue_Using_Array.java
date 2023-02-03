public class Queue_Using_Array
{
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
        }

        //to check queue is empty or not
        public static boolean isEmpty()
        {
            return rear==-1;
        }

        //add-O(1)
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("QUEUE is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }

        //remove-O(n)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("QUEUE is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        //peek-O(1)
        public static int peek()
        {
            return arr[0];
        }

//        //printint queue
//        public static void print()
//        {
//            while(isEmpty())
//            {
//                System.out.println(remove());
//            }
//        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
