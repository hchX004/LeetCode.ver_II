/*
*	7. 整数反转
*	给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
*
*	输入: 123
*	输出: 321
*
*	输入: -123
*	输出: -321
*
*	输入: 120
*	输出: 21
*
*	假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
*	请根据这个假设，如果反转后整数溢出那么就返回 0。
*/

//answer

class 20190117Solution {
    public int reverse(int x) {
        int lastNum, num, length;
        long returnNum;
        String str = "";
        boolean zeroFlag = true, mflag = false;
        if(x < 0) {
            if(x == Integer.MIN_VALUE) return 0;
            num = x*-1;
            mflag = true;
        }
        else num = x;
        length = String.valueOf(num).length();
        for(int i = 0; i < length; i++){
            lastNum = num%10;
            num /= 10;
            if(lastNum == 0 && zeroFlag) continue;
            else zeroFlag = false;
            str += lastNum;
        }
        if(str == "") str = "0";
        returnNum = Long.parseLong(str);
        if(mflag) returnNum = returnNum*-1;
        if(returnNum > Integer.MAX_VALUE || returnNum < Integer.MIN_VALUE) return 0;
        return (int)returnNum;
    }
}

/*
    弹出和推入数字 & 溢出前进行检查
*/

//best answer

/*
class Solution {
    public int reverse(int x) {
        if (x==0)
            return 0;
        StringBuilder res = new StringBuilder();
        if (x<0) {
            res.append("-");
            x = -x;
        }
        String tmpStr = String.valueOf(x);
        while (x!=0){
            res.append(x%10);
            x = x/10;
        }
        int result = 0;
        try {
            result = Integer.parseInt(res.toString());
        }catch (NumberFormatException e){
           // System.out.println(e);
        }
        return result;
    }
}
*/