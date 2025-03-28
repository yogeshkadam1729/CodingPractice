package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> combinations = new ArrayList<>();
            recursiveFunc(target,candidates,new ArrayList<>(),combinations,0);
            return combinations;
    }

    private void recursiveFunc(int target, int[] candidates, List<Integer> combination,
                               List<List<Integer>> combinationList, int startIdx) {
        if (target == 0) {
            combinationList.add(new ArrayList<>(combination));
            return;
        }
        for (int idx = startIdx; idx < candidates.length; idx++) {
            if (target >= candidates[idx]) { // Only proceed if valid
                combination.add(candidates[idx]);
                recursiveFunc(target - candidates[idx], candidates, combination, combinationList, idx);
                combination.remove(combination.size() - 1); // Backtrack
            }
        }
    }
}
