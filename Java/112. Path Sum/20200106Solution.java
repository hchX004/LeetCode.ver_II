//my answer 深度优先搜索

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

import javafx.util.Pair;

class 20200106Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root == null) return false;

        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        stack.add(new Pair(root, sum));

        while(!stack.isEmpty()){
        	Pair<TreeNode, Integer> current = stack.pollLast();
        	root = current.getKey();
        	int currentSum = current.getValue();
        	if(currentSum == root.val && (root.left == null) && (root.right == null)) return true;
        	if (root.left != null) {
        		stack.add(new Pair(root.left, currentSum-root.val));
      		}
      		if (root.right != null) {
        		stack.add(new Pair(root.right, currentSum-root.val));
      		}
        }
        return false;
    }
}

/*

递归算法

public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null)
      return false;

    sum -= root.val;
    if ((root.left == null) && (root.right == null))
      return (sum == 0);
    return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
 }

 */