package Week_4.Day_5;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SymmetricTree {
    boolean isMirror(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null)
            return true;
        if (r1 == null || r2 == null)
            return false;

        return r1.val == r2.val && isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        return isMirror(root.left, root.right);
    }
}
