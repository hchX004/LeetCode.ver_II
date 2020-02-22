//模拟


class 20200222Solution {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n, u = 0, d = n;
        int[][] res = new int[n][n];
        int len = n * n, num = 1;
        while(num <= len){
            for(int i = l; i < r; i++) res[u][i] = num++;
            u++;
            for(int i = u; i < d; i++) res[i][r - 1] = num++;
            r--;
            for(int i = r - 1; i >= l; i--) res[d - 1][i] = num++;
            d--;
            for(int i = d - 1; i >= u; i--) res[i][l] = num++;
            l++;
        }
        return res;
    }
}