public class MaxSubarraySum3 {
    // Kadane's Algorithm O(n)
    
    public static void maxSubArray(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length; i++ ) {                  // Check if all the numbers are negative
            if(nums[i] > 0) {
                n = 1;
                break;
            }
        }
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        if(n > 0) {                                              // There is atleast one positive number

            for(int i = 0; i < nums.length; i++) {
                currSum = currSum + nums[i];
                if(currSum < 0) {
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        else {                                                  // All numbers are negative or zero
            for(int i = 0; i < nums.length; i++) {
                maxSum = Math.max(maxSum, nums[i]);
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubArray(arr);
    }
    
}
