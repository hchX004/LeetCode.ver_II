//my answer

class 20190125Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        int len;
        if((len = strs.length) == 0) return 0;
        return strs[len-1].length();
    }
}

//best answer

/*
class Solution {
    public int lengthOfLastWord(String s) {
        int pos = s.length() - 1;
        int end = -1;
        while(pos >= 0){
            if(s.charAt(pos) == ' ') --pos;
            else{
                end = pos;
                break;
            }
        }
        if(end == -1) return 0;          
        while(--pos >= 0){
            if(s.charAt(pos) == ' ') break;
        }
        return end - pos;
    }
}
*/