//矩阵前缀和求矩阵区域部分和


class 20200204Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int row = mat.length;
        int col = mat[0].length;
        //定义并计算前缀和矩阵
        int[][] preSum = new int[row + 1][col + 1];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                preSum[i + 1][j + 1] = preSum[i + 1][j] + preSum[i][j + 1] - preSum[i][j] + mat[i][j];
            }
        }
        //定义并构建返回矩阵
        int[][] res = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                //左上角坐标
                int upLeftrow = Math.max(i - K , 0);
                int upLeftcol = Math.max(j - K , 0);
                //右下角坐标
                int downRightrow = Math.min(i + K , row - 1);
                int downRightcol = Math.min(j + K , col - 1);
                res[i][j] = preSum[downRightrow + 1][downRightcol + 1] - preSum[downRightrow + 1][upLeftcol] - preSum[upLeftrow][downRightcol + 1] + preSum[upLeftrow][upLeftcol];
            }
        }

        return res;
    }
}