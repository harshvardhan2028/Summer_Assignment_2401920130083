package Week_4.Day_2;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    void helper(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
    }
}
