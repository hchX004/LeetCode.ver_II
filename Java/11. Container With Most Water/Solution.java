// 20190218

// my answer excellent

class Solution {
    public int maxArea(int[] height) {
        int len = height.length, result = 0, tempMax;
        for(int i = 0, j = len-1; i < len && j >= i;){
            if(height[i] < height[j]){
                if((tempMax = height[i]*(j-i)) >= result) result = tempMax;
                i++;
            }
            else{
                if((tempMax = height[j]*(j-i)) >= result) result = tempMax;
                j--;
            }
        }
        return result;
    }
}

/*
    方法：双指针法
*/

//best answer

/*
class Solution {
    public int maxArea(int[] height) {
        int max = 0, nmax = 0;
        int i = 0, j = height.length - 1;
        int a;
        while(i < j){
            if (height[i] <= height[j]){
                nmax =  height[i] * (j - i);
                a = height[i];
                while(height[++i] <= a && i < j);
            }else{
                nmax =  height[j] * (j - i);
                a = height[j];
                while(height[--j] <= a && i < j);
            }
            if (nmax > max)max = nmax;
        }
        return max;
    }
}
*/
