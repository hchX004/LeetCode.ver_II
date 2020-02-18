//循环枚举


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


/*

 */