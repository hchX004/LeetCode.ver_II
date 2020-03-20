


import java.util.Collections; 

class Solution {

    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {

		int rows[] = new int[n];
		// 右斜对角线，2n-1层
		int hills[] = new int[2 * n - 1];
		// 左斜对角线，2n-1层
		int dales[] = new int[2 * n - 1];

        res = new ArrayList();
        List<String> ans =  new ArrayList();

		backTrack(0, ans, n, rows, hills, dales);

        return res;
	}

	public void backTrack(int row, List<String> ans, int n, int[] rows, int[] hills, int[] dales) {
		for (int col = 0; col < n; col++) {
			if (isNotUnderAttack(row, col, n, rows, hills, dales)) {
                // 初始化行
                String initRow = new String();
                for (int i = 0; i < n; i++) initRow += ".";

        		// 放置皇后
        		rows[col] = 1;
        		hills[row - col + n - 1] = 1;
        		dales[row + col] = 1;
                ans.add(putQueen(initRow, col));

        		// 如果已经有n个皇后可以放置
        		if (row + 1 == n) {
                    // 深复制
                    List<String> dest = new ArrayList<String>(Arrays.asList(new String[ans.size()]));
                    Collections.copy(dest, ans);
                    res.add(dest);
                }
        		// 如果没有则回溯
        		else backTrack(row + 1, ans, n, rows, hills, dales);

        		// 移走皇后
        		rows[col] = 0;
        		hills[row - col + n - 1] = 0;
        		dales[row + col] = 0;
                ans.remove(ans.size() - 1);
			}
		}
	}

	public boolean isNotUnderAttack(int row, int col, int n, int[] rows, int[] hills, int[] dales) {
		int res = rows[col] + hills[row - col + n - 1] + dales[row + col];
		return (res == 0) ? true : false;
	}

    public String putQueen(String row, int index) {
        StringBuilder sb = new StringBuilder(row);
        sb.setCharAt(index, 'Q');
        return sb.toString();
    }
}


/*
class Solution {
    public boolean[] colv ;
    public boolean[] digv ;
    public boolean[] digdv;
    public char[][] nQueens;
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        nQueens = new char[n][n];
        colv = new boolean[n];
        digv = new boolean[2*n-1];
        digdv = new boolean[2*n-1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }
        bdfs(0,res,n);
        return res;
    }
    public void bdfs(int start,List<List<String>> res,int n){
        if(start==n){
            List<String> cur = new ArrayList<>();
            for(char[] c:nQueens){
                cur.add(new String(c));
            }
            res.add(cur);
            return;
        }
        for(int i=0;i<n;i++){
            int dig = start+i;
            int digd = n-1+start-i;
            if(colv[i]||digv[dig]||digdv[digd]){
                continue;
            }
            colv[i]=digv[dig]=digdv[digd]=true;
            nQueens[start][i]='Q';
            bdfs(start+1,res,n);
            nQueens[start][i]='.';
            colv[i]=digv[dig]=digdv[digd]=false;
        }

    }
}
 */