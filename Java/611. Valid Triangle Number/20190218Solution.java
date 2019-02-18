//my answer

class 20190218Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            for(int k = i+1; k < n-1; k++){
                for(int j = k+1;j < n; j++){
                    if(nums[i] + nums[k] > nums[j]) count++;
                    else break;
                }
            }  
        }
        return count;
    }
}
//best answer

//类似快排

/*
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    res += r - l;
                    r--;
                }else {
                    l++;
                }
            }  
        }
       return res; 
    }
}
*/