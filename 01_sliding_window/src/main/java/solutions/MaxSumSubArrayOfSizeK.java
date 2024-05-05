package solutions;

public class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] nums) {
       int sum = 0;
       int max = Integer.MIN_VALUE;
       int j = 0;

       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           if (i >= k - 1) {
               max = Integer.max(max, sum);
               sum -= nums[j++];
           }
       }

       return max;
    }
}
