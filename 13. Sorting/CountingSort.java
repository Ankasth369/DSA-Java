public class CountingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // Find largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array to calculate frequency of each element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--; 
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 9, 0, 2, 4};
        countingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
