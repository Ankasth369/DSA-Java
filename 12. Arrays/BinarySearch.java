public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 8, 9};
        int index = binarySearch(arr, 7);
        if (index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element present at index " + index);
        }
    }
}
