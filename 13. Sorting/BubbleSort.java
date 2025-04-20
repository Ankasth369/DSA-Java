public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swapped = true;
            }
            // Checks if array is already sorted
            if (swapped == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 9, 0, 2, 4};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
