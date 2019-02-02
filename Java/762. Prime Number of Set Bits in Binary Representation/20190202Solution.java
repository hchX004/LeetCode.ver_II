//my answer

class 20190202Solution {
    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for(int i = L; i <= R; i++){
            int num = 0;
            boolean flag = true;
            if(i == 1) continue;
            String bits = Integer.toBinaryString(i);
            for(int j = 0; j < bits.length(); j++)
                if(bits.charAt(j)=='1') num++;
            for(int k = 2; k < num; k++){
                if(num % k == 0){
                    flag = false;
                    break;
                }
            }
            if(flag && num != 1) result++;
        }
        return result;
    }
}

//best answer
/*
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <=R ; i++) {
            int k = 665772 >> Integer.bitCount(i) & 1;
            if(k!=0)
                count++;
        }
        return count;
    }
}
*/