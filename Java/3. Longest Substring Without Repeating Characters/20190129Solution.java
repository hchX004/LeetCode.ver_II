//my answer

class 20190129Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length(), res = 0;
        int[] index = new int[128];
        for(int i = 0, j = 0; j < len; j++){
            i = Math.max(index[s.charAt(j)], i);
            res = Math.max(res, j-i+1);
            index[s.charAt(j)] = j+1;
        }
        return res;
    }
}

//暴力法
//滑动窗口法
//优化的滑动窗口法

