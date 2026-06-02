package Week_1.Day_2;

public class MaxAverageSubarray {
    public double maxAverage(int[] nums, int k) {
        long windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        long maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}

