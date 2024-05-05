package solutions;

public class AverageOfSubarrayOfSizeK {
    public static double[] findAveragesBrute(int[] nums, int k) {
        double[] numsAve = new double[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            double sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += nums[j];
                numsAve[i] = sum / k;
            }
        }
        return numsAve;
    }

    public static double[] findAverages(int[] nums, int k) {
        double[] numsAve = new double[nums.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            if (windowEnd >= k - 1) {
                numsAve[windowStart] = windowSum / k;
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return numsAve;
    }
}
