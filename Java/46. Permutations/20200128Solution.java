//回溯算法


class 20200128Solution {

	public void backtrack(int[] nums,
                        ArrayList<Integer> temp,
                        List<List<Integer>> output,
                        int[] visited) {
        //当temp排满时表示一个排列完成
        if (temp.size() == nums.length) {
            output.add(new ArrayList<Integer>(temp));
            return;
        }
        //遍历数组，寻找没有访问过的数，将其加入数组并回溯
        for (int i = 0; i < nums.length; i++) {
            if(visited[i] == 1) continue;
            visited[i] = 1;
            temp.add(nums[i]);
            backtrack(nums, temp, output, visited);
            //完成回溯后将temp和标志数组置空
            visited[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
    	//初始化输出
        List<List<Integer>> output = new LinkedList();
        //初始化标记数组
        int[] visited = new int[nums.length];
        //回溯算法
        backtrack(nums, new ArrayList<Integer>(), output, visited);

        return output;
    }
}