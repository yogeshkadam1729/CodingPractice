package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutation46 {

    public  void permutationNumbers(int[] nums,int [] perm,List<List<Integer>> permutation) {
        if(nums.length == 0) {
            permutation.add(Arrays.stream(perm).mapToObj(e -> Integer.parseInt(e+"")).collect(Collectors.toList()));
            return;
        }
        for(int i =0; i<nums.length;i++){
            int currNum = nums[i];
            int [] newPerm = Arrays.copyOf(perm,perm.length+1);
            newPerm[newPerm.length-1] = currNum;
            int[] newNum = new int[Arrays.copyOfRange(nums,0,i).length + Arrays.copyOfRange(nums,i+1,nums.length).length];
            System.arraycopy(Arrays.copyOfRange(nums,0,i), 0, newNum, 0, Arrays.copyOfRange(nums,0,i).length);
            System.arraycopy(Arrays.copyOfRange(nums,i+1,nums.length),0,newNum,Arrays.copyOfRange(nums,0,i).length,Arrays.copyOfRange(nums,i+1,nums.length).length);
            permutationNumbers(newNum,newPerm,permutation);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutationNumbers(nums,new int[0],permutations);
        permutations.stream().forEach(e -> System.out.println(e));
        return permutations;
    }

}
