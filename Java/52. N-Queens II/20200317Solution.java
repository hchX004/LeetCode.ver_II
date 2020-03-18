


class 20200317Solution {

	public int totalNQueens(int n) {
		int rows[] = new int[n];
		// 右斜对角线，2n-1层
		int hills[] = new int[2 * n - 1];
		// 左斜对角线，2n-1层
		int dales[] = new int[2 * n - 1];

		return backTrack(0, 0, n, rows, hills, dales);
	}



	public int backTrack(int row, int count, int n, int[] rows, int[] hills, int[] dales) {
		for (int col = 0; col < n; col++) {
			if (isNotUnderAttack(row, col, n, rows, hills, dales)) {
        		// 放置皇后
        		rows[col] = 1;
        		hills[row - col + n - 1] = 1;
        		dales[row + col] = 1;

        		// 如果已经有n个皇后可以放置
        		if (row + 1 == n) count++;
        		// 如果没有则回溯
        		else count = backTrack(row + 1, count, n, rows, hills, dales);

        		// 移走皇后
        		rows[col] = 0;
        		hills[row - col + n - 1] = 0;
        		dales[row + col] = 0;
			}
		}
		return count;
	}

	public boolean isNotUnderAttack(int row, int col, int n, int[] rows, int[] hills, int[] dales) {
		int res = rows[col] + hills[row - col + n - 1] + dales[row + col];
		return (res == 0) ? true : false;
	}
}
