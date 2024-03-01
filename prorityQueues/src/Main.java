import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        /*
        * Priority Queue = A FIFO data structure that serves elements
        *                  with the highest priorities first
        *                  before elements with lower priority
        */

        Queue<Double> queued = new PriorityQueue<>(Collections.reverseOrder());

        queued.offer(3.0);
        queued.offer(2.5);
        queued.offer(4.0);
        queued.offer(1.5);
        queued.offer(2.0);

        while(!queued.isEmpty()) {
            System.out.println(queued.poll());
        }

        Queue<String> queues = new PriorityQueue<>(Collections.reverseOrder());

        queues.offer("B");
        queues.offer("C");
        queues.offer("A");
        queues.offer("F");
        queues.offer("D");

        while(!queues.isEmpty()) {
            System.out.println(queues.poll());
        }

    }
}