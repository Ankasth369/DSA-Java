public class RecursiveBinarySearch {
    public static int binarySearch(int arr[], int l, int r, int key) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                return binarySearch(arr, l, mid - 1, key);
            }
            else {
                return binarySearch(arr, mid + 1, r, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 8, 9};
        int index = binarySearch(arr, 0, arr.length - 1, 7);
        if (index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element present at index " + index);
        }
    }
}
