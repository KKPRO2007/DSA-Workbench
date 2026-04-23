package Queue;

import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        while (!pq.isEmpty())
            System.out.print(pq.poll() + " "); // 1 3 5
    }
}