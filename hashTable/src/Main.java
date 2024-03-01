import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        /*
        * Hashtable = A data structure that stores unique keys to values ex <Integer, String>
        *             Each key/value pair is known as an Entry
        *             FAST insertion, look up, deletion of key/value pairs
        *             Not ideal for small data sets. great with large data sets
        *
        * hashing = Takes a key and computes an Integer (formula will vary based on key & data type)
        *           In a HashTable, we use the hash % capacity to calculate an index number.
        *
        *           key.hashCode() % capacity = index
        *
        * bucket = An indexed storage location for one or more Entries
        *          Can store multiple Entries in case of a collision (linked similarly LinkedList)
        *
        * collision = Hash function generates the same index for more than one key
        *             less collisions = more efficiency
        *
        * Runtime complexity: Best Case O(1)
        *                     Worst Case O(n)
        * */

        Hashtable <Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        // Print key value of elements of Hashtable
        printHashTable(table);

        // Remove element from table
        table.remove(777);

        printHashTable(table);

        Hashtable <String, String> table2 = new Hashtable<>(10);

        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");

        printHashTableS(table2);


    }
    private static void printHashTable(Hashtable <Integer, String> table) {
        /*
        *  Print key, value and hashcode
        */
        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }

    private static void printHashTableS(Hashtable <String, String> table) {
        /*
         *  Print key, value and hashcode
         */
        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}