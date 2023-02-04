import java.util.*;

public class Interleave_2_Halves
{
    public static void interleave_2_halves(Queue<Integer> q1)
    {
        Queue<Integer> q2=new LinkedList<>();
        int size_of_q1=q1.size();


        for(int i=0;i<size_of_q1/2;i++)
        {
            q2.add(q1.remove());
        }

        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);

        interleave_2_halves(q1);

        while(!q1.isEmpty())
        {
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
    }
}
