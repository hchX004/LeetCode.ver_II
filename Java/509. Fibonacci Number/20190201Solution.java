//my answer

class 20190201Solution {
    public int fib(int N) {
        if(N == 0) return 0;
        int last = 1, next = 1, temp = 0;
        for(int i = 1; i < N-1; i++){
            temp = next;
            next = last + next;
            last = temp;
        }
        return next;
    }
}

//菲波那切数列