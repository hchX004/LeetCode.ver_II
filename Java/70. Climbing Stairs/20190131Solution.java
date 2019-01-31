//my answer

class 20190131Solution {
//递归 12097ms
/*  int res = 0;
    public int climbStairs(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 2;
        else return climbStairs(n-2) + climbStairs(n-1);
*/  }
//非递归 3ms
    public int climbStairs(int n) {
        int last = 1, next = 1, temp = 0;
        for(int i = 1; i < n; i++){
            temp = next;
            next = last + next;
            last = temp;
        }
        return next;
    }
}

//菲波那切数列