


class NumMatrix {

    private int[][] preSum;

    public NumMatrix(int[][] matrix) {
        if(matrix.length == 0) return;
        int row = matrix.length;
        int col = matrix[0].length;
        //定义并计算前缀和矩阵
        preSum = new int[row + 1][col + 1];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                preSum[i + 1][j + 1] = preSum[i + 1][j] + preSum[i][j + 1] - preSum[i][j] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return preSum[row2 + 1][col2 + 1] - preSum[row1][col2 + 1] - preSum[row2 + 1][col1] + preSum[row1][col1];
    }
}

/*
class NumMatrix {

    int[][] preMatrix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = 0;
        if(m != 0) n = matrix[0].length;
        preMatrix = new int[m][n+1];
        for (int i = 0; i < m; i++){
            for (int j = 1; j < n+1; j++){
                preMatrix[i][j] = matrix[i][j-1] +preMatrix[i][j-1];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int temp1 = 0, temp2 = 0;
        for (int i = row1; i <= row2; i++){
            temp1 += preMatrix[i][col2+1];
            temp2 += preMatrix[i][col1];
        }
        return temp1 - temp2;
    }
}
*/

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */