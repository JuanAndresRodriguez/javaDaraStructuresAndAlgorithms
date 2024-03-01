import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        // ********************* LinkedList **********************
        startTime = System.nanoTime();

        // linkedList.get(0); // 16500 ns
        // linkedList.get(500000); // 3209900 ns
        // linkedList.get(999999); // 13800 ns
        // linkedList.remove(0); // 17400 ns
        // linkedList.remove(500000); // 3678000 ns
        linkedList.remove(999999); // 15600 ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // ********************* ArrayList ***********************

        startTime = System.nanoTime();

        // arrayList.get(0); // 5000 ns
        // arrayList.get(500000); // 4800 ns
        // arrayList.get(999999); // 4800 ns
        // arrayList.remove(0); // 627100 ns takes longer because it shifts all elements to the left
        // arrayList.remove(500000); // 284900 ns
        arrayList.remove(999999); // 7000 ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}