//my answer


//时间复杂度：O(nlogn)
class 20200122Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}


//哈希
//时间复杂度：O(n)
/*
//使用哈希表储存每一个元素
class Solution {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.E***y<Integer, Integer> majorityE***y = null;
        for (Map.E***y<Integer, Integer> e***y : counts.e***ySet()) {
            if (majorityE***y == null || e***y.getValue() > majorityE***y.getValue()) {
                majorityE***y = e***y;
            }
        }

        return majorityE***y.getKey();
    }
}
 */