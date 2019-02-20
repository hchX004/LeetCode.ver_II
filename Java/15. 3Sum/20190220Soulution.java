//my answer

class 20190220Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len == 0) return res;
        if(len < 3) return res;
        if(nums[0] == 0 && nums[len-1] == 0){
            res.add(Arrays.asList(0, 0, 0));
            return res;
        }
        if(nums[0] >= 0 || nums[len-1] <= 0) return res;
        for(int i = 0, j = len-1; i < len && j > i;){
            for(int l = i+1; l < j; l++){
                if(nums[i] + nums[l] + nums[j] == 0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[j]));
                    break;
                }
            }
            if(nums[j] > 0) j--;
            else{
                i++;
                j = len-1;
            }
        }
        Set<List<Integer>> set = new HashSet<List<Integer>>(res);
        res = new ArrayList<List<Integer>>(set);
        return res;
    }
}

//best snswer

/*
class Solution {
    public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    return res;
	}
}
*/

/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
                return Collections.emptyList();
            List<List<Integer>> res = new ArrayList<>();
            int minValue = Integer.MAX_VALUE;
            int maxValue = Integer.MIN_VALUE;
            int negSize = 0;
            int posSize = 0;
            int zeroSize = 0;
            for (int v : nums) {
                if (v < minValue)
                    minValue = v;
                if (v > maxValue)
                    maxValue = v;
                if (v > 0)
                    posSize++;
                else if (v < 0)
                    negSize++;
                else
                    zeroSize++;
            }
            if (zeroSize >= 3)
                res.add(Arrays.asList(0, 0, 0));
            if (negSize == 0 || posSize == 0)
                return res;
            if (minValue * 2 + maxValue > 0)
                maxValue = -minValue * 2;
            else if (maxValue * 2 + minValue < 0)
                minValue = -maxValue * 2;

            int[] map = new int[maxValue - minValue + 1];
            int[] negs = new int[negSize];
            int[] poses = new int[posSize];
            negSize = 0;
            posSize = 0;
            for (int v : nums) {
                if (v >= minValue && v <= maxValue) {
                    if (map[v - minValue]++ == 0) {
                        if (v > 0)
                            poses[posSize++] = v;
                        else if (v < 0)
                            negs[negSize++] = v;
                    }
                }
            }
            Arrays.sort(poses, 0, posSize);
            Arrays.sort(negs, 0, negSize);
            int basej = 0;
            for (int i = negSize - 1; i >= 0; i--) {
                int nv = negs[i];
                int minp = (-nv) >>> 1;
                while (basej < posSize && poses[basej] < minp)
                    basej++;
                for (int j = basej; j < posSize; j++) {
                    int pv = poses[j];
                    int cv = 0 - nv - pv;
                    if (cv >= nv && cv <= pv) {
                        if (cv == nv) {
                            if (map[nv - minValue] > 1)
                                res.add(Arrays.asList(nv, nv, pv));
                        } else if (cv == pv) {
                            if (map[pv - minValue] > 1)
                                res.add(Arrays.asList(nv, pv, pv));
                        } else {
                            if (map[cv - minValue] > 0)
                                res.add(Arrays.asList(nv, cv, pv));
                        }
                    } else if (cv < nv)
                        break;
                }
            }
            return res;
        
    }
}
*/

