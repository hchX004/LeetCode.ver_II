


class 20200327Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int move = 0;
        // 遍历数组，若当前元素小于等于它的前一个元素，则将其变为前一个数+1
        for (int i = 1; i < A.length; i++) {
            // 比如排完过后是 [1,2,2,2,3]，A[2] + 1后就是 [1,2,3,2,3]，这时候 A[3] 就比 A[2] 小了，需要move两次
            // 因此需要使用 <=
            if (A[i] <= A[i - 1]) {
                int pre = A[i];
                A[i] = A[i - 1] + 1;
                move += A[i] - pre;
            }
        }

        return move;
    }
}