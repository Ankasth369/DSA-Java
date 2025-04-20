public class Largest {
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 0, 1, 3, 5};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Largest No. is " + largest);
    }
}
