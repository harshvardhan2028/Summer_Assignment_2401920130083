package Week_4.Day_4;

public class MaximumPathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxPath(root);
        return maxSum;
    }

    private int findMaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(0, findMaxPath(node.left));
        int right = Math.max(0, findMaxPath(node.right));

        int currentPath = node.val + left + right;

        maxSum = Math.max(maxSum, currentPath);

        return node.val + Math.max(left, right);
    }
}
