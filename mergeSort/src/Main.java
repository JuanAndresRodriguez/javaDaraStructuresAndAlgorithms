public class Main {
    /* merge sort = recursively divide array in 2, sort, re-combine
    * run-time complexity = O(n Log n)
    * space complexity = O(n)
    *
    * */
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        printArray(array);

        mergeSort(array);

        printArray(array);

        mergeSortBackwards(array);

        printArray(array);
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        } else {
            int middle = length / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[length - middle];
            int i = 0;
            int j = 0;
            for (; i < length; i++){
                if (i < middle) {
                    leftArray[i] = array[i];
                } else {
                    rightArray[j] = array[i];
                    j++;
                }
            }
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray,array);
        }
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    private static void mergeSortBackwards(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        } else {
            int middle = length / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[length - middle];
            int i = 0;
            int j = 0;
            for (; i < length; i++) {
                if (i < middle) {
                    leftArray[i] = array[i];
                } else {
                    rightArray[j] = array[i];
                    j++;
                }
            }
            mergeSortBackwards(leftArray);
            mergeSortBackwards(rightArray);
            mergeBackwards(leftArray, rightArray, array);
        }
    }

    private static void mergeBackwards(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging in descending order
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] > rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    private static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}