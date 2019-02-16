//my answer

class 20190216Solution {
    public char findTheDifference(String s, String t) {
        int snum = 0, tnum = 0;
        for(int i = 0; i < s.length(); i++) snum += s.charAt(i);
        for(int j = 0; j < t.length(); j++) tnum += t.charAt(j);
        return (char)(tnum - snum);
    }
}

//best answer
/*
class Solution {
    public char findTheDifference(String s, String t) {
        char[] chs=s.toCharArray();
        char[] cht = t.toCharArray();
        char ch = cht[0];
        for (int i = 0; i < chs.length; i++){
            ch ^= chs[i];
            ch ^= cht[i+1];
        }
        return ch;
    }
}
*/