package com.practice.code;

public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, tank = 0, startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            // If tank is empty, restart from the next station
            if (tank < 0) {
                startIndex = i + 1;  // Next station is a candidate start
                tank = 0;  // Reset the tank for the new start
            }
        }

        // If totalGas < totalCost, no valid circuit exists
        return totalGas < totalCost ? -1 : startIndex;
    }

}
