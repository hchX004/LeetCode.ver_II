//my answer

class 20190224Solution {
    public String toLowerCase(String str) {
        char[] charArrays = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for(char ch : charArrays){
            if(ch <= 'Z' && ch >= 'A'){
                ch += 32;
                res.append(ch);
            }
            else res.append(ch);
        }
        return res.toString();
    }
}
//best answer

/*
class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
*/