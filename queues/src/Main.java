import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        * Queue = FIFO data structure. First-In First-Out (ex. A line of people)
        *         A collection designed for holding elements prior to processing
        *         Linear data structure
        *
        *         add = enqueue, offer()
        *         remove = dequeue, poll()
        */

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue); // print all queue

        System.out.println(queue.peek()); // See first in line

        queue.poll(); // remove first in line
        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll(); // poll doesn't cause an exception if queue is empty
        System.out.println(queue);

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty()); // returns boolean
        System.out.println(queue.size()); // size of the queue
        System.out.println(queue.contains("Harold")); // check element belongs to queue


    }
}