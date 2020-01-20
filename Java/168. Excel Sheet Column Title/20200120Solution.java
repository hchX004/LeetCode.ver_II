//my answer


//26进制问题
class 20200120Solution {
    public String convertToTitle(int n) {
        if(n <= 0) return "";
        StringBuilder str = new StringBuilder();
        while(n > 0){
            n -= 1;
            str.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        return str.reverse().toString();
    }
}