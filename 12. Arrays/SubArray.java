public class SubArray {
    
        public static void printSubarrays(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int arr[] = {3, 5, 8, 9, 0, 1};
            printSubarrays(arr);
    
        }
    
    
}
