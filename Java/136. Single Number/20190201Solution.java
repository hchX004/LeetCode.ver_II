//my answer

class 20190201Solution {
    public int singleNumber(int[] nums) {
        int value = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)) map.remove(i);
            else map.put(i, 1);
        }
        return map.entrySet().iterator().next().getKey();
    }

//best answer
/*
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++)
        {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
*/