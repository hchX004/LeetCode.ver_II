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
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return root;
        TreeNode p = root.left;
        root.left = root.right;
        root.right = p;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}