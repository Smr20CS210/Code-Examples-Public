package midterm2;

import java.util.PriorityQueue;
import java.util.Queue;

public class E16PriorityQueue {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Bob");
        pq.add("Alice");
        pq.add("Charlie");

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
