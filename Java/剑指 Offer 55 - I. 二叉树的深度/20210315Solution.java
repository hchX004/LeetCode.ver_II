/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 20210315Solution {
    public int maxDepth(TreeNode root) {
        int deepLeft, deepRight;
        if (root == null) return 0;
        deepLeft = maxDepth(root.left) + 1;
        deepRight = maxDepth(root.right) + 1;
        return deepRight > deepLeft ? deepRight : deepLeft;
    }
}