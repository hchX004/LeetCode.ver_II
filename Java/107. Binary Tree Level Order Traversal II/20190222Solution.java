//my answer 100%

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 20190222Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        travel(lists, 0, root);
        for (int i = 0, j = lists.size() - 1; i < j; i++, j--) {
            List<Integer> temp = lists.get(i);
            lists.set(i, lists.get(j));
            lists.set(j, temp);
        }
        return lists;
    }
    
    private void travel(List<List<Integer>> lists, int level, TreeNode root) {
        if (root == null) return;
        if (lists.size() == level) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
        }
        else lists.get(level).add(root.val);
        travel(lists, level + 1, root.left);
        travel(lists, level + 1, root.right);
    }
}

//可以用栈实现颠倒顺序的输出