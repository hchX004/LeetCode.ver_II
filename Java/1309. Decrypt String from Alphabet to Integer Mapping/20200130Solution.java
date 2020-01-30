//顺序遍历，向后看两位，或者从后遍历再倒过来


class 20200130Solution {
    public String freqAlphabets(String s) {
        char[] temp = s.toCharArray();
        String res = "";
        for(int i = 0; i < temp.length; i++){
            if (i + 2 < temp.length && temp[i + 2] == '#') {
                res += (char)((temp[i] - '0') * 10 + (temp[i + 1] - '1') + 'a');
                i += 2;
            }
            else {
                res += (char)(temp[i] - '1' + 'a');
            }
        }
        return res;
    }
}