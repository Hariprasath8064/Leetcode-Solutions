// Last updated: 7/4/2025, 9:07:56 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {

            minPrice = Math.min(prices[i], minPrice);
            maxPro = Math.max(maxPro, prices[i] - minPrice);

        }
        return maxPro;
    }
}