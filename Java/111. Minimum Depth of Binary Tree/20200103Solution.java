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

/*
深度优先搜索迭代

import javafx.util.Pair;
class Solution {
  public int minDepth(TreeNode root) {
    LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>(); //初始化栈，LIFO(后进先出)栈
    if (root == null) {
      return 0;                                                     //空则返回0
    }
    else {
      stack.add(new Pair(root, 1));                                 //添加第一层
    }

    int min_depth = Integer.MAX_VALUE;                              //设置深度为最大整数
    while (!stack.isEmpty()) {                                      //如果栈不为空
      Pair<TreeNode, Integer> current = stack.pollLast();           //弹出栈顶第一对
      root = current.getKey();
      int current_depth = current.getValue();                       //得到根和层数
      if ((root.left == null) && (root.right == null)) {            //如果左右子树都为空
        min_depth = Math.min(min_depth, current_depth);             //更新最小深度
      }
      if (root.left != null) {                                      //如果左子树不为空
        stack.add(new Pair(root.left, current_depth + 1));          //把左子树  加入栈中，层数+1
      }
      if (root.right != null) {                                     //如果右子树为空
        stack.add(new Pair(root.right, current_depth + 1));         //把右子树加入栈中，层数+1
      }
    }
    return min_depth;                                               //返回所得的最小层数
  }
}
 */



/*
广度优先搜索迭代

import javafx.util.Pair;
class Solution {
  public int minDepth(TreeNode root) {
    LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>(); //初始化队列，FIFO(先进先出)队列
    if (root == null) {
      return 0;                                                     //空则返回0
    }
    else {
      stack.add(new Pair(root, 1));                                 //添加第一层
    }

    int current_depth = 0;                                          //初始化当前层数
    while (!stack.isEmpty()) {
      Pair<TreeNode, Integer> current = stack.poll();               //弹出队列第一对
      root = current.getKey();
      current_depth = current.getValue();
      if ((root.left == null) && (root.right == null)) {
        break;
      }
      if (root.left != null) {
        stack.add(new Pair(root.left, current_depth + 1));
      }
      if (root.right != null) {
        stack.add(new Pair(root.right, current_depth + 1));
      }
    }
    return current_depth;                                           //最先找到为空的叶的层数为最小的层数
  }
}
 */