//my answer

class 20190130Solution {
    public double myPow(double x, int n) {
        double result = 1;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0) result *= x;
            x *= x;
        }
        return n < 0 ? 1/result : result;
    }

//best answer
/*
class Solution {
    public double myPow(double x, int n) {
      if(n==0) return 1;
      double res = 1;
      if(n==0) return x;
      long len = Math.abs((long)n);
      while(len!=0){
          if((len&1) == 1) res*=x;
          x = x*x;
          len = len>>1;
      }
        return n<=0?1/res:res;
    }
}
*/