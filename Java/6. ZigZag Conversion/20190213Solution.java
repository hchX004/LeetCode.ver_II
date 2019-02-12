//my answer

class 20190213Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if(numRows == 1) return s;
        String res = "";
        for(int i = 0; i < len; i = i+numRows*2-2) res += s.charAt(i);
        for(int row = 1; row < numRows-1; row++){
            int count = 1;
            for(int i = row; i < len;){
                res += s.charAt(i);
                if(count%2 == 1) i = i + (numRows-row-1)*2;
                else i = i + row*2;
                count++;
            }
        }
        for(int i = numRows-1; i < len; i = i+numRows*2-2) res += s.charAt(i);
        return res;
    }
}

//best answer //StringBuilder超快的
/*
class Solution {
    public static String convert(String s, int numRows) {
        if ("".equals(s)) return "";
        if(numRows == 0 || numRows == 1) return s;
        char[] totalChars = s.toCharArray();
        int length = totalChars.length;
        int chunkNums = numRows * 2 - 2;
        int chunks = length / chunkNums + 1;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            if (j == 0) {
                for (int i = 0; i < chunks; i++) {
                    int index = i * chunkNums;
                    if (index < length) {
                        sb.append(totalChars[index]);
                    }
                }
            } else if (j == numRows - 1) {
                for (int i = 0; i < chunks; i++) {
                    int index = i * chunkNums + (numRows - 1);
                    if (index < length) {
                        sb.append(totalChars[index]);
                    }
                }
            } else {
                for (int i = 0; i < chunks; i++) {
                    int firstIndex = i * chunkNums + j;
                    int secondIndex = i * chunkNums + (chunkNums - j);
                    if (firstIndex < length) {
                        sb.append(totalChars[firstIndex]);
                    }
                    if (secondIndex < length) {
                        sb.append(totalChars[secondIndex]);
                    }
                }
            }
        }
        return sb.toString();
    }
}
*/