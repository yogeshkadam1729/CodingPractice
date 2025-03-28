package com.practice.code;

import java.util.Arrays;

public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] minCoinsDp = new int[amount + 1];
        Arrays.fill(minCoinsDp, amount + 1); // Fill with an upper bound value
        minCoinsDp[0] = 0; // Base case: 0 coins needed to make amount 0
        for (int coin : coins) { // Process each coin
            for (int i = coin; i <= amount; i++) {
                minCoinsDp[i] = Math.min(minCoinsDp[i], minCoinsDp[i - coin] + 1);
            }
        }
        return (minCoinsDp[amount] > amount) ? -1 : minCoinsDp[amount];
    }
}
