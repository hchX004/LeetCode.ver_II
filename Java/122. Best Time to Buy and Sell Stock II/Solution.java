// 20200115

// my answer

// 只要后面一天的价格比前一天高就购买，贪心算法

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, differ;
        for(int i = 0; i < prices.length-1; i++){
            differ = prices[i+1] - prices[i];
            if(differ > 0) profit += differ;
        }
        return profit;
    }
}
