//暴力法或哈希


class 20200208Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        for (char s : S.toCharArray()){
            for (char j : J.toCharArray()){
                if(s == j) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}