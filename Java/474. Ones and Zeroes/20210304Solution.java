class 20210304Solution {
    public int findMaxForm(String[] strs, int m, int n) {
            int[][] dp = new int[m+1][n+1];
            for (int k = 0; k < strs.length; k++) {
                int[] zeroesOnesNum = countZeroesOnes(strs[k]);
                for (int i = m; i >= 0; i--) {
                    for (int j = n; j >= 0; j--) {
                        if (i - zeroesOnesNum[0] >= 0 && j - zeroesOnesNum[1] >= 0) {
                            if (1 + dp[i-zeroesOnesNum[0]][j-zeroesOnesNum[1]] > dp[i][j]){
                                dp[i][j] = 1 + dp[i-zeroesOnesNum[0]][j-zeroesOnesNum[1]];
                            }
                        }
                    }
                }
            }
            return dp[m][n];
    }

    // 得到字符串中0和1的个数
    public int[] countZeroesOnes(String s) {
        int[] c = new int[2];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i)-'0']++;
        }
        return c;
    }

}