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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (!isBalanced(root.left) || !isBalanced(root.right)) return false;
        if (Math.abs(deepOfTreeNode(root.left) - deepOfTreeNode(root.right)) <= 1) return true;
        return false;
    }

    public int deepOfTreeNode(TreeNode root) {
        int deepLeft, deepRight;
        if (root == null) return 0;
        deepLeft = deepOfTreeNode(root.left) + 1;
        deepRight = deepOfTreeNode(root.right) + 1;
        return deepRight > deepLeft ? deepRight : deepLeft;
    }
}