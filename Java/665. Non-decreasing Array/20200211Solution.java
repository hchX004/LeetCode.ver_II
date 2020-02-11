


class 20200211Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length < 3) return true;
        int flag = 0;
        for(int i = 1; i < nums.length && flag < 2; i++){
            if(nums[i - 1] <= nums[i]) continue;
            flag++;
            if(i - 2 >= 0 && nums[i - 2] > nums[i]) nums[i] = nums[i - 1];
            else nums[i - 1] = nums[i];
        }
        return flag <= 1;
    }
}