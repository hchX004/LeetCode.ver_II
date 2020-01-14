//my answer
//动态规划


class 20200114Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int min = prices[0], p = 0;
        for(int s : prices){
            p = Math.max(p, s - min);
            min = Math.min(min, s);
        }
        return p;
    }
}