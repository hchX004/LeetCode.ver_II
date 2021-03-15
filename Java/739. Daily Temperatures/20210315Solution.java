class 20210315Solution {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];
        if (length == 0) return result;
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < length*2; i++) {
            while (!s.empty() && T[s.peek()] < T[i % length]) {
                result[s.peek()] = i % length - s.peek();
                if (result[s.peek()] < 0) result[s.peek()] = 0;
                s.pop();
            }
            s.push(i % length);
        }
        return result;
    }
}