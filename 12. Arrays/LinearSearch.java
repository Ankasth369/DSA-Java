public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 0, 1, 2, 8, 9};
        int index = linearSearch(arr, 7);
        if (index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element present at index " + index);
        }
    }
}
