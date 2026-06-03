package Week_1.Day_3;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq > rightsq) {
                ans[idx] = leftsq;
                idx--;
                left++;
            } else {
                ans[idx] = rightsq;
                idx--;
                right--;
            }
        }
        return ans;
    }
}

