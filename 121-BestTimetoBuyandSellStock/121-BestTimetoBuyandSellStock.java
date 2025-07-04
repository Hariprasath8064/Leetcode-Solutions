// Last updated: 7/4/2025, 9:06:27 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i< n;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int profit = prices[i] - min ;
            max =  Math.max(profit,max);
        }
        return max;
    }
}