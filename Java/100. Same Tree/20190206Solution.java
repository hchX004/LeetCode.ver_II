//my answer

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 20190206Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else if(p.val == q.val){
            if(isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
            else return false;
        }
        else return false;
    }
}