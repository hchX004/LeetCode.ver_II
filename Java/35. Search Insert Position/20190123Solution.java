//my answer

class 20190123Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int num: nums){
            if(num == target || num > target) break;
            index++;
        }
        return index;
    }
}