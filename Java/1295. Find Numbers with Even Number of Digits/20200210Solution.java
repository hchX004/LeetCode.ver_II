


class 20200210Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int num : nums){
            int i = 0;
            while(num != 0){
                i++;
                num /= 10;
            }
            if(i % 2 == 0) res++;
        }
        return res;
    }
}