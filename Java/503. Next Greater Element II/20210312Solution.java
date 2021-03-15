class 20210312Solution {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return new int[0];
        }     
        int[] doubleNums = new int[length*2];
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            doubleNums[i] = nums[i];
            doubleNums[i+length] = nums[i];
        }
        for (int j = 0; j < length; j++){
            int k = j;
            while (k+1 < length*2 && doubleNums[k+1] <= doubleNums[j] && k-j < length) {
                //System.out.println(doubleNums[k+1] + " : " + doubleNums[j]);
                k++;
            }
            //System.out.println(k-j);
            if (k-j < length) {      
                result[j] = doubleNums[k+1];
            } else {
                result[j] = -1;
            }         
        }
        return result;
    }
}

/* 题解 单调栈
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;
    }
}
*/