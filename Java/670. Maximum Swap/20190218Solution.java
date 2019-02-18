//my answer

class 20190218Solution {
    public int maximumSwap(int num) {
        String str = Integer.toString(num);
        String arr[] = str.split("");
        int[] nums = new int[arr.length], max = new int[arr.length];
        for(int i = 0; i < arr.length; i++) nums[i] = Integer.valueOf(arr[i]).intValue();
        max = nums.clone();
        Arrays.sort(max);
        for(int j = 0; j < nums.length; j++){
            int m = max[nums.length - j - 1];
            if(nums[j] != m){
                int pos = j;
                for(int n = j; n < nums.length; n++){
                    if(nums[n] == m) pos = n;
                }
                nums[pos] = nums[j];
                nums[j] = m;
                break;
            }
        }
        str = "";
        for(int m = 0; m < nums.length; m++){
            str += Integer.toString(nums[m]);
        }
        int res = Integer.parseInt(str);
        return res;
    }
}
//best answer

/*
class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        
        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;
        }
        
        for (int i = 0; i < digits.length; i++) {      
            for (int k = 9; k > digits[i] - '0'; k--) {   
                if (buckets[k] > i) {     
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }
        
        return num;
    }
}
*/