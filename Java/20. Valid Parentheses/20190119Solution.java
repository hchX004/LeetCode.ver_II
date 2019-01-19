//my answer

class Solution {
    public boolean isValid(String s) {
        char[] chs = s.toCharArray();
        int sDepth = 0;
        ArrayList<Character> stack = new ArrayList<Character>();
        for(char ch:chs){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.add(ch);
                sDepth++;
            }
            if(ch == ')' || ch == '}' || ch == ']'){
                if(sDepth-1 >= 0){
                    char temp = stack.get(sDepth-1);
                    if((ch == ')'&&temp == '(') || (ch == '}'&&temp == '{') || (ch == ']'&&temp == '[')){
                        stack.remove(sDepth-1);
                        sDepth--;
                    } else return false;
                } else return false;
            }
        }
        if(sDepth != 0) return false;
        else return true;
    }
}

// 就是栈……