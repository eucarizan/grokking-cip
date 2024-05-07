package solutions;

public class MinSubArraySum {
    public static int findMinSubArray(int sum, int[] nums) {
        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
	
		for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			windowSum += nums[windowEnd];

			while (windowSum >= sum) {
				minLength = Math.min(minLength, windowEnd - windowStart + 1);
				windowSum -= nums[windowStart];
				windowStart++;
			}
		}
	
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
