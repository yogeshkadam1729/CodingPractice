package com.practice.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Combinations77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        findSubCombination(n,k,1,new ArrayList<>(),combinations);
        return combinations;
    }

    private void findSubCombination(int n,int k,int start,List<Integer> permutation,List<List<Integer>> combination) {
        if(permutation.size() == k) {
            combination.add(new ArrayList<>(permutation));
            return ;
        }
        for(int num = start;num<=n - (k - permutation.size()) + 1;num++){
            permutation.add(num);
            findSubCombination(n,k,num+1,permutation,combination);
            permutation.remove(permutation.size()-1);
        }
    }
}
