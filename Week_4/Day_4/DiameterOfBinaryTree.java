package Week_4.Day_4;

public class DiameterOfBinaryTree {
    static int max;

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        levels(root);
        return max;
    }

    public int levels(TreeNode root) {
        if (root == null)
            return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        max = Math.max(max, leftLevel + rightLevel);
        return 1 + Math.max(leftLevel, rightLevel);
    }
}
