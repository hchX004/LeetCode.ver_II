class 20210315Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int length = m*n;
        int[][] flag = new int[m][n];
        int[] result = new int[length];
        int i = 0, j = 0;
        for (int k = 0; k < length;) {
            while (j < n && flag[i][j] == 0 && k < length) {
                flag[i][j] = 1;
                result[k++] = matrix[i][j++];          
            }
            j--;
            i++;
            while (i < m && flag[i][j] == 0 && k < length) {
                flag[i][j] = 1;
                result[k++] = matrix[i++][j];  
            }
            i--;
            j--;
            while (j >= 0 && flag[i][j] == 0 && k < length) {
                flag[i][j] = 1;
                result[k++] = matrix[i][j--];
            }
            i--;
            j++;
            while (i >= 0 && flag[i][j] == 0 && k < length) {
                flag[i][j] = 1;
                result[k++] = matrix[i--][j];
            }
            j++;
            i++;
        }
        ArrayList<Integer> resultList = new ArrayList<Integer>(length);
        for (int num : result) {
            resultList.add(num);
        }
        return resultList;
    }
}