// 20210405

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

// 快速构造列表用
import static java.util.Arrays.asList;

class Solution {

    public List<Integer> ans;
    public int index = 0;
    public boolean flag = false;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        ans = new ArrayList<>();

        preTraverseCheck(root, voyage);

        if (flag) return asList(-1);

        return ans;
    }

    // 使用前序遍历来检查是否能通过翻转得到给出前序序列
    public void preTraverseCheck(TreeNode root, int[] voyage) {
        // 节点为空则返回
        if(root == null)
            return;
        // 节点值不相等则记录标记为无法翻转（按遍历来说这里的节点已经翻转过了）
        if(root.val != voyage[index]){
            flag = true;
            return;
        }
        // 节点左节点值不相等即将遍历的前序序列值则翻转左右节点
        if(root.left != null && root.left.val != voyage[index+1]){
            TreeNode p = root.left;
            root.left = root.right;
            root.right = p;
            this.ans.add(root.val);
        }
        // 前序遍历+序列值+1
        this.index++;
        preTraverseCheck(root.left, voyage);
        preTraverseCheck(root.right, voyage);
    }
}