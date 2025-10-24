package FreeTime.Day17Practice;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("one");
        pq.add("two");
        pq.add("three");
        pq.add("four");
        System.out.println(pq);
    }
}
