// 20190118

// my answer

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, num, result = 0;
        if(x < 0) return false;
        while(temp != 0){
            num = temp%10;
            temp /= 10;
            result = result*10 + num;
        }
        if(result == x) return true;
        else return false;
    }
}

/*
    方法：反转一半数字
*/

//best answer ^

/*
    为什么不考虑只反转 \text{int}int 数字的一半？毕竟，如果该数字是回文，其后半部分反转后应该与原始数字的前半部分相同。
*/
