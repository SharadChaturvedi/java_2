//How to write a code to build a Quizapp in java?
//Give me a code to print sorting in JAVA?
public class BlackboxTest {
    public static void main(String[] args) {
      int[] arr = {5, 2, 8, 3, 1, 6, 4};
  
      System.out.println("Before sorting:");
      printArray(arr);
  
      bubbleSort(arr);
  
      System.out.println("After sorting:");
      printArray(arr);
    }
  
    public static void bubbleSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
            // Swap arr[j] and arr[j + 1]
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
    }
  
    public static void printArray(int[] arr) {
      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }