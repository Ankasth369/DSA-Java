public class ArrayTest {
    public static void update(int arr[], int non_changeable) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        non_changeable = 5;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 1, 9, 0, 3};
        int non_changeable = 10;
        update(arr, non_changeable);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(non_changeable);
    }
}
