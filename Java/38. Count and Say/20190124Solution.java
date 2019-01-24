//my answer

class 20190124Solution {
    public String countAndSay(int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            char[] chs = result.toCharArray();
            result = "";
            int index = 1, len = chs.length;
            for(int j = 0; j < len; j++){
                if(j-1 >= 0 && chs[j-1] == chs[j]) index++;
                if(j-1 >= 0 && chs[j-1] != chs[j]){
                    result = result + index + chs[j-1];
                    index = 1;
                }
            }
            if(len > 0) result = result + index + chs[len-1];
            if(i == 0) result = "1";
        }
        return result;
    }
}

//best answer

/*
class Solution {
    public String countAndSay(int n) {
            
        String cur="1";
        
        for(int i=1;i<n;i++){
        
            StringBuilder sb=new StringBuilder();
            char pre=cur.charAt(0);
            int count=1;
            for(int j=1;j<cur.length();j++){
                if(cur.charAt(j)==pre){
                    count++;
                }else{
                    sb.append(count).append(pre);
                    pre=cur.charAt(j);
                    count=1;
                }
            }
            sb.append(count).append(pre);
            cur=sb.toString();
        }
        return cur;
    }
}
*/