//my answer

class 20190205Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        for(int i = 0; i < m+n; i++){
            if(i < m){
                if(nums1[i] < nums2[0]) continue;
                else{
                    int temp = nums1[i];
                    nums1[i] = nums2[0];
                    nums2[0] = temp;
                    sort(nums2, n);
                }
            }
            else nums1[i] = nums2[i-m];
        }
    }
    
    public void sort(int[] nums, int n){
        for(int i = 1, j = 0; i < n; i++, j++){
            if(nums[j] < nums[i]) return;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}

//best answer

/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = (m--) + (n--) -1;
        while(m>=0&&n>=0){
            nums1[p--] = nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        while(n>=0){
            nums1[p--]=nums2[n--];
        }
    }
}
*/