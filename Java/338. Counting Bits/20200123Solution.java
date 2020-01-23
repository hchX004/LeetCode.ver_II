//my answer


class 20200123Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];           //初始化输出答案
        int i = 0, b = 1;                       //b为2^0
        while (b <= num) {
            while(i < b && i + b <= num){
                ans[i + b] = ans[i] + 1;        //相隔b位的二进制数中的1的数目相差1
                ++i;
            }
            i = 0;                              //i大于等于b时将i清0
            b <<= 1;                            //b增加2倍
        }
        return ans;
    }
}