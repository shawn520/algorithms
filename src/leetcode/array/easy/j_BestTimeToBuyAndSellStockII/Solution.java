package leetcode.array.easy.j_BestTimeToBuyAndSellStockII;

/**
 * 思路：
 * 贪心算法，局部最优->全局最优
 * 如果今天比昨天涨了，则交易
 * 如果没涨则不交易
 * @author Shawn
 * @date 2020/7/17
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfits = 0;
        for(int i=1; i< prices.length; i++) {
            int profit = prices[i] - prices[i-1];
            if(profit >0) maxProfits += profit;
        }
        return maxProfits;
    }
}
