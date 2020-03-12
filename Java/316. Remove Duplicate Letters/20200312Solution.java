


class 20200312Solution {
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        if(len < 2) return s;
        boolean[] set = new boolean[26];    // 记录是否在已经得到的字符串中
        int[] index = new int[26];
        for(int i = 0; i < len; i++) index[s.charAt(i) - 'a'] = i;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len; i++) {
            if(set[s.charAt(i) - 'a']) continue;
            while(!stack.empty() && stack.peek() > s.charAt(i) && index[stack.peek() -'a'] >= i) set[stack.pop() - 'a'] = false;
            stack.push(s.charAt(i));
            set[s.charAt(i) - 'a'] = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.empty()) stringBuilder.insert(0, stack.pop());
        return stringBuilder.toString();
    }
}