//从上往下每层交错相加并取最小保存


import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 0; i < triangle.size() - 1; i++){
            int[] flags = new int[triangle.get(i + 1).size()];
            for(int k = 0; k < flags.length; k++) flags[k] = Integer.MIN_VALUE;
            for(int j = 0; j < triangle.get(i).size(); j++){
                if(flags[j] == Integer.MIN_VALUE){
                    flags[j] = triangle.get(i + 1).get(j);
                    triangle.get(i + 1).set(j, flags[j] + triangle.get(i).get(j));
                } else {
                    int pre = triangle.get(i + 1).get(j), now = flags[j] + triangle.get(i).get(j);
                    if(now < pre) triangle.get(i + 1).set(j, now);
                }
                if(flags[j + 1] == Integer.MIN_VALUE){
                    flags[j + 1] = triangle.get(i + 1).get(j + 1);
                    triangle.get(i + 1).set(j + 1, flags[j + 1] + triangle.get(i).get(j));
                } else {
                    int pre = triangle.get(i + 1).get(j + 1), now = flags[j + 1] + triangle.get(i).get(j + 1);
                    if(now < pre) triangle.get(i + 1).set(j, now);
                }
            }
        }
        //System.out.println(triangle);
        return Collections.min(triangle.get(triangle.size() - 1));
    }
}


/*
public int minimumTotal(List<List<Integer>> triangle) {
	int[] dp = new int[triangle.size()];

	for (int i = 0; i < triangle.size(); i++) {
		dp[i] = triangle.get(triangle.size()-1).get(i);
	}

	for (int i = triangle.size()-2; i >= 0; i--) {
		for (int j = 0; j < triangle.get(i).size(); j++) {
			dp[j] = Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
		}
	}
	return dp[0];
}
 */