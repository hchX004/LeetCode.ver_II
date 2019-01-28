//my answer

class 20190128Solution {
   public int mySqrt(int x) {
        if(x <= 1) return x;
        long r = x;
        while(r > x/r)
            r = (long)(x/r + r)/2;
        return (int)r;
    }
}

//牛顿迭代法

//或者：public int mySqrt(int x) { return x = (int)Math.sqrt(x); }