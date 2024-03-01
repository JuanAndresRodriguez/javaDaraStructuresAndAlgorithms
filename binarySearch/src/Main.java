import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Binary search = Search algorithm that finds the position
        *                  of a target value within a sorted array.
        *                  Half of the array is eliminated during each "step"
        */

        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // built-in binary search
        // int index = Arrays.binarySearch(array, target);

        // programmed
        int index = binarySearch(array, target);


        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.printf(target + " found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle + 1;
            } else {
                return middle; // target is found
            }
        }
        return -1; // target not found
    }
}