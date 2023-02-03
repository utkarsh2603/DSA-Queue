import java.util.*;

public class Queue_Using_JCF
{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(3);
        q.add(6);
        q.add(9);
        q.add(12);
        q.add(15);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
