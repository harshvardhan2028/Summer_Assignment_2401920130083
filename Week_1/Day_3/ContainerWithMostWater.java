package Week_1.Day_3;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxWater = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int conWater = width * h;
            maxWater = Math.max(maxWater, conWater);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}

