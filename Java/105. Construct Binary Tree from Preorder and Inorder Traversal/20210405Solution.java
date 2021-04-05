//my answer

/* 利用前序遍历的方式构建，递归调用构建函数
*  前序：root left_sub_tree right_sub_tree
*  中序：left_sub_tree root right_sub_tree
*  根据 root 在中序的位置，判断子树是否已经构建完成
*/

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

class 20210405Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        for(int index = 0; index < inorder.length; index++){
            inMap.put(inorder[index], index);
        }
        return buildTreeByPre(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    }

    public TreeNode buildTreeByPre(int[] preorder, int preStart, int preEnd, 
    int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);

        root.left = buildTreeByPre(preorder, preStart + 1, preStart + inRoot - inStart, inorder, inStart, inRoot - 1, inMap);
        root.right = buildTreeByPre(preorder, preStart + inRoot - inStart + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

        return root;
    }
}