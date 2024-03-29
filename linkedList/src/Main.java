import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        * LinkedList =  Nodes are in 2 parts (data + address)
        *               Nodes are in non-consecutive memory locations
        *               Elements are linked using pointers
        * advantages?
        * 1. Dynamic Data Structure (allocates needed memory while running)
        * 2. Insertion and Deletion of Nodes is easy. O(1)
        * 3. No/Low memory waste
        *
        * disadvantages?
        * 1. Greater memory usage (additional pointer)
        * 2. No random access of elements (no index [i])
        * 3. Accessing/searching elements is more time consuming. O(n)
        *
        * uses?
        * 1. implement Stacks/Queues
        * 2. GPS navigation
        * 3. music playlist
        * */

        LinkedList<String> linkedList = new LinkedList<String>();

        /* Using Linked List as Stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        */

        // Using Linked List as Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst()); // first node of linked list
        System.out.println(linkedList.peekLast()); // last node of linked list
        linkedList.addFirst("0"); // add to top of the list
        linkedList.addLast("G"); // add to tail of LinkedList
        String first = linkedList.removeFirst(); // they can also be stored into variables
        String last = linkedList.removeLast();

        System.out.println(linkedList);

    }
}