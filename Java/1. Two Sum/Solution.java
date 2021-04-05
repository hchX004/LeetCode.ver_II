// 20190118

// my answer

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}

/*
    方法一：暴力法
    方法二：两遍哈希表
*/

//best answer

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i++) {
           map.put(nums[i],i);
        }
        
        for(int i = 0;i< nums.length;i ++) {
            int temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i) {
                return new int[] {i,map.get(temp)};
            }
            
        }
        return null;
    }
}
*/

//这个应该是一个模拟的哈希表

/*
class Solution {
    int size = 2048;
    int[] map = new int[size];
    int length = 2047;
    int index;
    
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            index = nums[i]&length;

            if (map[index] != 0) {
                return new int[] { map[index] - 1, i };
            } else {
                map[(target - index)&length ] = i + 1;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/

