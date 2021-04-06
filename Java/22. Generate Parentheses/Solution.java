// 20200113

// my answer

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        return generate(res, "", 0, 0, n);
    }

    public List<String> generate(List<String> res, String str, int l, int r, int n){
        if(l > n || r > n) return res;
        if(l == n && r == n){
            res.add(str);
            return res;
        }
        //DFS剪枝，左括号要大于右括号
        if(l >= r){
            res = generate(res, str+"(", l+1, r, n);
            res = generate(res, str+")", l, r+1, n);
        }
        return res;
    }
}



/*
//动态规划

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // 把结果集保存在动态规划的数组里

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        // 这里 dp 数组我们把它变成列表的样子，方便调用而已
        List<List<String>> dp = new ArrayList<>(n);

        List<String> dp0 = new ArrayList<>();
        dp0.add("");
        dp.add(dp0);

        //dp[i] = "(" + dp[可能的括号对数] + ")" + dp[剩下的括号对数]
        
        for (int i = 1; i <= n; i++) {
            List<String> cur = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = dp.get(j);
                List<String> str2 = dp.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        // 枚举右括号的位置
                        cur.add("(" + s1 + ")" + s2);
                    }
                }
            }
            dp.add(cur);
        }
        return dp.get(n);
    }
}
*/

// O(4^n/n^(1/2))

/*
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }
}
*/