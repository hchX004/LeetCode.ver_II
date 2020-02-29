


class 20200229Solution {
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];
        for(int i = 0; i < indices.length; i++){
            r[indices[i][0]] = !r[indices[i][0]];
            c[indices[i][1]] = !c[indices[i][1]];
        }
        int a = 0, b = 0;
        for(int i = 0; i < r.length; i++) if(r[i]) a++;
        for(int i = 0; i < c.length; i++) if(c[i]) b++;
        return a * m + b * n - a * b * 2;
    }
}