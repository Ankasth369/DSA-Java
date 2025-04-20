public class MaxSubarraySum2 {
    //optimized solution using prefix sum
    public static void printMaxSubarraySum(int arr[]) {
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int maxSum = prefixSum[0];
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = i + 1; j < prefixSum.length; j++) {
                maxSum = Math.max(maxSum, prefixSum[j] - prefixSum[i] );
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        printMaxSubarraySum(arr);
    }
}
