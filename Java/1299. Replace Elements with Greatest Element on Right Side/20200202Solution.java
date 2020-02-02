


class Solution {
    public int[] replaceElements(int[] arr) {
        /*int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        for(int i = n - 2; i >= 0; i--){
            res[i] = res[i + 1] > arr[i + 1] ?  res[i + 1] : arr[i + 1];
        }
        return res;*/
        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int tmp = arr[i];
            arr[i] = max;
            if(tmp > max) max = tmp;
        }
        return arr;
    }
}