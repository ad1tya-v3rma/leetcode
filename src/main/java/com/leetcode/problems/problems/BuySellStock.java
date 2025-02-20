package com.leetcode.problems.problems;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int flagIndex = 0;

        int buy = 0;
        int sell = 1;
        int maxProfit=0;
        int currentProfit = 0;
        while(buy < prices.length-1)
        {
            currentProfit = prices[sell] - prices[buy];
            if(currentProfit > maxProfit)
            {
                maxProfit = currentProfit;
            }
            sell++;
            if(sell == prices.length)
            {
                buy++;
                sell = buy+1;
            }
        }

        return maxProfit;
    }
}
