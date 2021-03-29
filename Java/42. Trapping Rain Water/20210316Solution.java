class 20210316Solution {
    public int trap(int[] height) {
    if (height == null || height.length == 0) return 0;
    int ans = 0;
    int size = height.length;
    int[] left_max = new int[size];
    int[] right_max = new int[size];
    left_max[0] = height[0];
    right_max[size-1] = height[size-1];
    for (int i = 1; i < size; i++) {
        left_max[i] = Math.max(height[i], left_max[i-1]);
        right_max[size-1-i] = Math.max(height[size-1-i], right_max[size-i]);
    }
    for (int i = 1; i < size - 1; i++) {
        ans += Math.min(left_max[i], right_max[i]) - height[i];
    }
    return ans;
}
    /* //暴力解法
    public int trap(int[] height) {
        int length = height.length;
        int pillarSum = sumOfArray(height);
        int[] array = height;
        int allSum = 0;
        while (sumOfArray(array) != 0) {
            allSum += length - checkArrayBothSidesContinuousZero(array);
            for (int i = 0; i < length; i++) {             
                if (array[i] != 0) array[i]--;
            }
        }
        int rainSum = allSum - pillarSum;
        return rainSum;
    }

    public int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public int checkArrayBothSidesContinuousZero(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) sum++;
            else if (sum == array.length) return sum;
            else break;
        }
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == 0) sum++;
            else if (sum == array.length) return sum;
            else break;
        }
        return sum;
    }
    */
}