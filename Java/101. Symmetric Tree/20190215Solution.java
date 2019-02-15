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
class 20190215Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirrorTree(root, root);
    }
    
    public boolean isMirrorTree(TreeNode p, TreeNode q){
        if(p == null) return q == null;
        else if(q == null) return p == null;
        else if(p.val == q.val)
            return isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
        else return false;
    }
}

//best answer
/*
class Solution {
    private boolean isSymmetrics(TreeNode left,TreeNode right){
		if(left == null && right ==null) return true;
		if(left == null || right ==null) return false;
		if(left.val == right.val)
			return (isSymmetrics(left.left, right.right) && isSymmetrics(left.right,right.left));
        else return false;
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
		return isSymmetrics(root.left, root.right);
    }
    
}
*/