//my answer

class 20190125Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for(int num:nums){
            if((sum += num) > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}

//负数相加或者负正数不可能比它的加数大，可以将其和视为，判断下一个数大小为多少