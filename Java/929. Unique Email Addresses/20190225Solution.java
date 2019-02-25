//my answer

class 20190225Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<String>();
        for (String s : emails) {
            char[] ss = s.toCharArray();
            int len = ss.length;
            int curr = 0, actual = 0;
            while(curr < len) {
                switch(ss[curr]) {
                    case '.':
                        ++curr;
                        break;
                    case '+':
                        while(curr < len && ss[curr] != '@') ++curr;
                        while(curr < len) ss[actual++] = ss[curr++];
                        break;
                    case '@':
                        while(curr < len) ss[actual++] = ss[curr++];
                        break;
                    default:
                        ss[actual++] = ss[curr++];
                        break;
                }
            }
            emailSet.add(new String(ss, 0, actual));
        }
        return emailSet.size();
    }
}
