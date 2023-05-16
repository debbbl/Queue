package PriorityQueue;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args){
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.offer(4);
        q1.offer(8);
        q1.offer(1);
        q1.offer(2);
        q1.offer(9);
        q1.offer(6);
        q1.offer(3);
        q1.offer(7);

        System.out.println("q1:"+ q1.toString());
        System.out.println("Removing the first element in q1... ");
        System.out.println(q1.poll()+" is removed");
        q1.add(5);
        Object[] temp=q1.toArray();

        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();

        System.out.println("Retrieve the first element in the priority queue: "+q1.peek());
        System.out.println("Check if the priority queue consists of element \"1\" : "+q1.contains(1));
        System.out.println("current size of the priority queue: "+q1.size());
        while(!q1.isEmpty()){
            System.out.print(q1.poll()+" ");
        }
        System.out.println();

        PriorityQueue<Integer> q3=new PriorityQueue<>(Collections.reverseOrder());
        q3.offer(4);
        q3.offer(8);
        q3.offer(1);
        q3.offer(2);
        q3.offer(9);
        q3.offer(6);
        q3.offer(3);
        q3.offer(7);
        System.out.println(q3.toString());

    }
}
