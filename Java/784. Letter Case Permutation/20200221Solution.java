//递归


class 20200221Solution {
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> res = new ArrayList();
        res.add(new StringBuilder());
        for (char c: S.toCharArray()) {
            int size = res.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < size; i++) {
                    res.add(new StringBuilder(res.get(i)));
                    res.get(i).append(Character.toLowerCase(c));
                    res.get(size + i).append(Character.toUpperCase(c));
                }
            } else for (int i = 0; i < size; i++) res.get(i).append(c);
        }
        List<String> ans = new ArrayList();
        for (StringBuilder sb: res) ans.add(sb.toString());
        return ans;
    }
}