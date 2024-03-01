public class Main {
    /*
    * quick sort = moves smaller elements to left of a pivot.
    *              recursively divide array in 2 partitions
    *
    * run-time complexity = Best case O(n log(n))
    *                       Average case  O(n log(n))
    *                       Worst case O(n^2) if already sorted
    *
    * space complexity = O(log(n)) due to recursion
    */
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        printArray(array);

        quickSort(array, 0, array.length - 1);

        printArray(array);

        quickSortBackwards(array, 0, array.length - 1);

        printArray(array);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            return; // base case
        } else {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    private static void quickSortBackwards(int[] array, int start, int end) {
        if (end <= start) {
            return; // base case
        } else {
            int pivot = partitionBackwards(array, start, end);
            quickSortBackwards(array, start, pivot - 1);
            quickSortBackwards(array, pivot + 1, end);
        }
    }

    private static int partitionBackwards(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] > pivot) { // Modified comparison condition for descending order
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    private static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}