public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 7, 1, 4,12,44,99,100,12};

        // Display the original array
        System.out.println("Original array:");
        printArray(array);

        // Sort the array using bubble sort
        bubbleSort(array);

        // Display the sorted array
        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Bubble sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
