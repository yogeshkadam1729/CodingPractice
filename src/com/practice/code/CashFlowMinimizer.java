package com.practice.code;

import java.util.*;

public class CashFlowMinimizer {
    public  List<List<Integer>> minimizeCashflow(int[][] transactions) {
        int n = transactions.length;
        List<List<Integer>> minimizedTransaction = new ArrayList<>();
        HashMap<Integer,Integer> balanceMap = new HashMap<>();
        PriorityQueue<int[]> debitors = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));//min heap
        PriorityQueue<int[]> creditors = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));//max heap
        for(int trans=0;trans < n;trans++) {
            int payer = transactions[trans][0];
            int payee = transactions[trans][1];
            int amount = transactions[trans][2];
            balanceMap.put(payer, balanceMap.getOrDefault(payer,0)-amount);
            balanceMap.put(payee, balanceMap.getOrDefault(payee,0)+amount);
        }
        balanceMap.entrySet().stream().forEach(entry -> {
            if(entry.getValue() > 0)
                creditors.add(new int[]{entry.getKey(), entry.getValue()});
            if(entry.getValue() < 0)
                debitors.add(new int[]{entry.getKey(), entry.getValue()});
        });
        while (!creditors.isEmpty() && !debitors.isEmpty()) {
            int[] credit = creditors.poll();
            int[] debit = debitors.poll();
            int amount = Math.min(-debit[1],credit[1]);
            minimizedTransaction.add(List.of(debit[0],credit[0],amount));
            debit[1] = debit[1]+amount;
            credit[1] = credit[1]-amount;
            if(debit[1] < 0) debitors.add(debit);
            if(credit[1] > 0) creditors.add(credit);
        }
        return minimizedTransaction;
    }
    public  int minimizeTransaction(int[][] transactions) {
        int n = transactions.length;
        int minTransaction = 0;
        HashMap<Integer,Integer> balanceMap = new HashMap<>();
        PriorityQueue<int[]> debitors = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));//max heap
        PriorityQueue<int[]> creditors = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));//max heap
        for(int trans=0;trans < n;trans++) {
            int payer = transactions[trans][0];
            int payee = transactions[trans][1];
            int amount = transactions[trans][2];
            balanceMap.put(payer, balanceMap.getOrDefault(payer,0)-amount);
            balanceMap.put(payee, balanceMap.getOrDefault(payee,0)+amount);
        }
        balanceMap.entrySet().stream().forEach(entry -> {
            if(entry.getValue() > 0)
                creditors.add(new int[]{entry.getKey(), entry.getValue()});
            if(entry.getValue() < 0)
                debitors.add(new int[]{entry.getKey(), entry.getValue()});
        });
        while (!creditors.isEmpty() && !debitors.isEmpty()) {
            int[] credit = creditors.poll();
            int[] debit = debitors.poll();
            int amount = Math.min(-debit[1],credit[1]);
            debit[1] = debit[1]+amount;
            credit[1] = credit[1]-amount;
            if(debit[1] < 0) debitors.add(debit);
            if(credit[1] > 0) creditors.add(credit);
            minTransaction++;
        }
        return minTransaction;
    }

}
