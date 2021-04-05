// 20210405

// my answer
//后序遍历计算从下往上计算每一个节点存在的最大路径，同时遍历过程中更新最终答案

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return this.ans;
    }

    public int oneSideMax(TreeNode root) {
        if (root == null) return 0;
        int left = max(0, oneSideMax(root.left));
        int right = max(0, oneSideMax(root.right));
        // update ans
        this.ans = max(this.ans, left + right + root.val);
        return max(left, right) + root.val;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}