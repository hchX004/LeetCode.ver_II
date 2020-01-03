//my answer



public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

class 20200103Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int ml = minDepth(root.left);
        int mr = minDepth(root.right);
        return root.left == null || root.right == null ? ml+mr+1 : Math.min(ml, mr)+1;
    }
}