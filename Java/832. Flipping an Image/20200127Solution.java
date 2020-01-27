// row[i] = row[column - i - 1] 水平翻转


class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int column = A[0].length;
        for(int[] row : A){
            for(int i = 0; i < (column + 1) / 2; i++){
                int temp = row[i];
                row[i] = row[column - i - 1] ^ 1;
                row[column - i - 1] = temp ^ 1;
            }
        }
        return A;
    }
}