//my answer

class 20200107Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);												//排序
        int ans = nums[0] + nums[1] + nums[2];							//初始化和
        for(int i = 0; i < nums.length; i++){							//循环遍历
        	int start = i+1, end = nums.length-1;						//设定双指针
        	while(start < end){
        		int sum = nums[start] + nums[end] + nums[i];			//当前指针和
        		if(Math.abs(target - sum) < Math.abs(target - ans))
        			ans = sum;											//绝对值更接近则更新
        		if(sum > target) end--;									//如果指针和大于目标，则需要将尾指针往前移，将和减小
        		else if (sum < target) start++;							//如果指针和小于目标，则需要将头指针往后移，将和增大
        		else return ans;
        	}
        }
        return ans;
    }
}