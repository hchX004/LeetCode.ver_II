// 20190217

// my answer

class Solution {
    public int myAtoi(String str) {
        if(str.length() == 0) return 0;
        int pos = 0;
        while (pos < str.length() && str.charAt(pos) == ' '){
            pos++;
        }
        str = str.substring(pos, str.length());
        if(str.equals("")) return 0;
        boolean operator = true;
        char first = str.charAt(0);
        if(first < '0' || first > '9'){
            if(first == '-') operator = false;
            else if(first == '+') operator = true;
            else return 0;
            str = getNumString(str.substring(1, str.length()));
        }
        else str = getNumString(str);
        if(str.equals("")) return 0;
        if(str.length() > 10){
            if(operator) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        long num = Long.parseLong(str);
        if(!operator) num = -num;
        if(num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)num;
    }
    
    private String getNumString(String str){
        StringBuilder numStr = new StringBuilder();
        boolean isStart = false;
        for(int i = 0; i < str.length(); i++){
            char charNum = str.charAt(i);
            if(charNum >= '0' && charNum <= '9'){
                if(!isStart && charNum == '0') continue;
                isStart = true;
                numStr.append(charNum);
            }
            else break;
        }
        return numStr.toString();
    }
}

//best answer
/*
class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        // 去除前面的空格
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        long res = 0;
        boolean positive = true;
        if (str.charAt(start) == '-') {
            positive = false;
            start++;
        } else if (str.charAt(start) == '+'){
            start++;
        }
        for (int j = start; j < str.length(); j++) {
            if (str.charAt(j) == ' ' || str.charAt(j) < '0' || str.charAt(j) > '9') {
                break;
            }
            res = res * 10 + (str.charAt(j) - '0');
            if (!positive && -res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (positive && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        if (positive == false) {
            res = -res;
        }
        return (int) res;
    }
}
*/