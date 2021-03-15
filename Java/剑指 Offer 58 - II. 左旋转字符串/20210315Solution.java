class 20210315Solution {
    public String reverseLeftWords(String s, int n) {
        /*
        char[] ch = s.toCharArray();
        String subStrR = new String(), subStrL = new String();
        for (int i = 0; i < s.length(); i++) {
            if (i < n) subStrR += ch[i];
            else subStrL += ch[i];
        }
        return subStrL + subStrR;
        */
        return s.substring(n) + s.substring(0, n);
    }
}