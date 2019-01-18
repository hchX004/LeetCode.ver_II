//my answer

class 20190118Solution {
    public String longestCommonPrefix(String[] strs) {
        int minlength = 0, index = 0;
        String result = "";
        boolean fristFlag = true, flag = false;
        char[][] charStrs = new char[strs.length][];
        for(String str: strs){
            char[] charStr = str.toCharArray();
            if(fristFlag){
                minlength = charStr.length;
                fristFlag = false;
            }
            if(!fristFlag && charStr.length < minlength) minlength = charStr.length;
            charStrs[index] = charStr;
            index++;
        }
        for(int i = 0; i < minlength; i++){
            char comp = charStrs[0][i];
            for(char[] cStr: charStrs){
                if(cStr[i] != comp){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            else result += comp;
        }
        return result;
    }
}

/*
    方法一：水平扫描法
    算法二：水平扫描
    算法三：分治
    方法四：二分查找法
*/