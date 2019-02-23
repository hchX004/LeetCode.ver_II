//my answer

class 20190223Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}

/*
class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        for (; ; ) {
            if (low >= high) return true;
            int start = (int) s.charAt(low);
            if (start >= 65 && start <= 90) start += 32;
            if ((start >= 97 && start <= 122) || (start >= 48 && start <= 57)) {
                int end = (int) s.charAt(high);
                if (end >= 65 && end <= 90) end += 32;
                if ((end >= 97 && end <= 122) || (end >= 48 && end <= 57)) {
                    if (start != end) return false;
                    else {
                        low++;
                        high--;
                    }
                }
                else high--;
            }
            else low++;
        }
    }
}
 */