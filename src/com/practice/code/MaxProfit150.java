package com.practice.code;

public class MaxProfit150 {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int buy = 0;
        for(int i=0;i<prices.length;i++)
        {
            buy = ( i ==0 || (prices[i] - buy) <= 0) ? prices[i] : buy;
            profit = Math.max(profit,prices[i] - buy);
        }
        return profit;
    }
    public int totalMaxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int totalProfit = 0;
        for(int i=1;i<prices.length;i++)
        {

            if(prices[i]  < prices[i-1]) {
                buy = prices[i];
                totalProfit = totalProfit + profit;
                profit = 0;
            }
            profit = Math.max(profit,prices[i] - buy);
        }
        totalProfit = totalProfit+profit;
        return totalProfit;
    }
    public static void main(String args[]) {
        int [] prices = new int[]{7,1,5,3,6,4};
        MaxProfit150 mx = new MaxProfit150();
        mx.totalMaxProfit(prices);
    }
}
