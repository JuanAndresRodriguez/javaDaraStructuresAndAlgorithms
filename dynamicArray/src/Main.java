import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // in-built dynamic array
        // ArrayList<String> arrayList = new ArrayList<String>();

        // DynamicArray dynamicArray = new DynamicArray(5);
        // System.out.println(dynamicArray.capacity);

        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);

        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);

        dynamicArray.delete("X");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
    }
}