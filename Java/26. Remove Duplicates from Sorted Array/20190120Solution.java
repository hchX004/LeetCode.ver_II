//my answer

class 20190120Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0, index = 0, pre = 0;
        for(int num:nums){
            if(index == 0){
                result++;
                index++;
                pre = num; 
                continue;
            }
            if(pre != num){
                nums[result] = num;
                result++;
            }
            pre = num;  
            index++;
        }
        return result;
    }
}

//方法：双指针法

//best answer

/*
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
*、