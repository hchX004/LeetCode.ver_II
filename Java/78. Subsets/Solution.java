// 20200218

// 循环枚举

class 20200218Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (int n : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<Integer>(res.get(i));
                newSubset.add(n);
                res.add(newSubset);
            }
        }
        return res;
    }
}

//位运算

/*
public static List<List<Integer>> binaryBit(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    for (int i = 0; i < (1 << nums.length); i++) {
        List<Integer> sub = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++)
            if (((i >> j) & 1) == 1) sub.add(nums[j]);
        res.add(sub);
    }
    return res;
}
*/

//递归枚举

/*
public static void recursion(int[] nums, int i, List<List<Integer>> res) {
    if (i >= nums.length) return;
    int size = res.size();
    for (int j = 0; j < size; j++) {
        List<Integer> newSub = new ArrayList<Integer>(res.get(j));
        newSub.add(nums[i]);
        res.add(newSub);
    }
    recursion(nums, i + 1, res);
}
*/

//DFS，前序遍历

/*
public static void preOrder(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> res) {
    if (i >= nums.length) return;
    // 到了新的状态，记录新的路径，要重新拷贝一份
    subset = new ArrayList<Integer>(subset);
    // 这里
    res.add(subset);
    preOrder(nums, i + 1, subset, res);
    subset.add(nums[i]);
    preOrder(nums, i + 1, subset, res);
}
*/

//DFS，中序遍历

/*
public static void inOrder(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> res) {
    if (i >= nums.length) return;
    subset = new ArrayList<Integer>(subset);

    inOrder(nums, i + 1, subset, res);
    subset.add(nums[i]);
    // 这里
    res.add(subset);
    inOrder(nums, i + 1, subset, res);
}
*/

//DFS，后序遍历

/*
public static void postOrder(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> res) {
    if (i >= nums.length) return;
    subset = new ArrayList<Integer>(subset);

    postOrder(nums, i + 1, subset, res);
    subset.add(nums[i]);
    postOrder(nums, i + 1, subset, res);
    // 这里
    res.add(subset);
}
*/

//回溯

/*
public static void backtrack(int[] nums, int i, List<Integer> sub, List<List<Integer>> res) {
    for (int j = i; j < nums.length; j++) {
        if (j > i && nums[j] == nums[j - 1]) continue;
        sub.add(nums[j]);
        res.add(new ArrayList<Integer>(sub));
        backtrack(nums, j + 1, sub, res);
        sub.remove(sub.size() - 1);
    }
}
*/