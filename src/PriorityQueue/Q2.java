package PriorityQueue;

import java.util.*;

public class Q2 {
    public static void main(String[] args){
        PriorityQueue<String> q1 = new PriorityQueue<>();
        PriorityQueue<String> q2 = new PriorityQueue<>();
        q1.offer("George");
        q1.offer("Jim");
        q1.offer("John");
        q1.offer("Blake");
        q1.offer("Kevin");
        q1.offer("Michael");

        q2.offer("George");
        q2.offer("Katie");
        q2.offer("Kevin");
        q2.offer("Michelle");
        q2.offer("Ryan");

        Set<String> union2=new HashSet<>(q1);
        union2.addAll(q2);
        PriorityQueue<String> union = new PriorityQueue<>(union2);
        System.out.println("Union: "+union2.toString());
        PriorityQueue<String> difference = new PriorityQueue<>(q1);
        difference.removeAll(q2);
        System.out.println("Difference: "+difference.toString());
        PriorityQueue<String> intersection = new PriorityQueue<>(q1);
        intersection.retainAll(q2);
        System.out.println("Intersection: "+intersection.toString());

    }
}
