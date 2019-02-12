//my answer 567ms

class 20190212Solution {
	public String longestPalindrome(String s) {
        char[] ss = s.toCharArray();
        int len = s.length(), max = 0;
        for(int j = len; j > 0; j--){
            for(int i = 0; i+j <= len; i++){
                String str = s.substring(i, i+j);
                if(isPalStr(str)) return str;
            }
        }
        return "";
    }
    
    public boolean isPalStr(String s){
        //char[] ss = s.toCharArray();
        //int len = s.length();
        //if(len == 0 || ss[0] != ss[len-1]) return false;
        //if(len == 1 || len == 2) return true;
        //if(!isPalStr(s.substring(1, len-1))) return false;
        //return true;
        int L = 0, R = s.length()-1;
        while (L <= R && s.charAt(L) == s.charAt(R)) {
            if(L == R || L+1 == R) return true;
            L++;
            R--;
        }
        return false;
    }
}

//best answer
/*
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right){
        int L = left, R = right;
        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R - L - 1;
    }
}

//

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int[] range = new int[2];
        for(int i = 0; i < len; i++) i = helper(s, range, i);
        return s.substring(range[0], range[1]);
    }

    public int helper(String s, int[] range, int i){
        int lo = i, hi = i, len = s.length();
        while (hi < len-1 && s.charAt(hi) == s.charAt(hi+1)) hi++;
        int ret = hi;
        while (lo > 0 && hi < len-1 && s.charAt(lo-1) == s.charAt(hi+1)){
            lo--;
            hi++;
        }
        if(hi+1 - lo > range[1] - range[0]){
            range[0] = lo;
            range[1] = hi+1;
        }
        return ret;
    }
}
*/