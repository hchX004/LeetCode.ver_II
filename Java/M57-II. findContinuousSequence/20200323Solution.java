


class 20200323Solution {
    public int[][] findContinuousSequence(int target) {

        List<int[]> res = new ArrayList();

        for(int m = target / 2; m > 1; m--){

            //x + (x + 1) + ... + (x + m - 1) == target => m * x + m * (m - 1) / 2 == target

            if((target - m * (m - 1) / 2) % m == 0 && target - m * (m - 1) / 2 > 0){
                int x = (target - m * (m - 1) / 2) / m;
                //System.out.println(x + " and " + m);
                int[] temp = new int[m];
                for(int i = 0; i < m; i++) temp[i] = x++;
                res.add(temp);
            }
        }
        return res.toArray(new int[0][]); 
    }
}


/*

class Solution {
    public int[][] findContinuousSequence(int target) {
        /*
         * 连续数字为等差数列，设首项为x，末项为x+i，则和为s=(x+x+i)*(i+1)/2=t
         * 即 2(i+1)x+(i+1)i-2t=0，求得 x=(t-(i+1)i/2)/(i+1) 为正整数，则有
         * ① (i+1)i/2 < t
         * ② (t-(i+1)i/2) % (i+1) == 0
         * i从1开始递增，求出x后，有y=x+i
         *
        if (target < 3) return new int[][]{};

        int i = 1, temp = 0;
        List<int[]> lists = new LinkedList<>();

        while ((temp = (i + 1) * i >> 1) < target) {
            if ((target - temp) % (i + 1) == 0) {
                int start = (target - temp) / (i + 1);
                lists.add(0, getList(start, start + i));
            }
            i++;
        }
        // toArray(T[] t)方法返回一个类T的数组，这个数组包含了类T中的所有元素。
        return lists.toArray(new int[0][]);
    }

    private int[] getList(int start, int end) {
        int[] res = new int[end - start + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + start;
        }
        return res;
    }
}

 */