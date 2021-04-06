// 20190206

// my answer

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

//通过大小为2的滑动窗口找到1个或者2个逆序，进而找到需要交换两个值的节点

class Solution {

    public TreeNode preNode, x, y;

    public void recoverTree(TreeNode root) {
        traverse(root);
        int t = x.val;
        x.val = y.val;
        y.val = t;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);

        //System.out.print(preNode == null ? -1 : preNode.val);
        //System.out.print(root.val);

        if (preNode != null && root.val < preNode.val) {
            if (x == null) x = preNode;
            y = root;
        }
        preNode = root;
        
        traverse(root.right);
    }
}