


class 20200210Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, mul = 1;
        while(n != 0){
            int i = n % 10;
            sum += i;
            mul *= i;
            n /= 10;
        }
        return mul - sum;
    }
}