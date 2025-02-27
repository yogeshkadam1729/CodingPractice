package com.practice.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumGeneticMutation433 {
    public int minMutation(String startGene, String endGene, String[] bank) {
        int mutation = 0;
        Set<String> uniqueBank = new HashSet<>(Arrays.asList(bank));
        Set<Character> validChar = new HashSet<>(Arrays.asList('A','C','G','T'));
        for(int i = 0;i<endGene.length();i++){
            if(startGene.charAt(i) != endGene.charAt(i)) {
                for(Character c : validChar){
                    char [] charArray = startGene.toCharArray();
                    charArray[i] = c;
                    String replaceGene = new String(charArray);
                    if(uniqueBank.contains(replaceGene)){
                        mutation++;
                        startGene = replaceGene;
                        if(startGene.equalsIgnoreCase(endGene)) return mutation;
                        uniqueBank.remove(replaceGene);
                        break;
                    }
                }
            }
        }

        return -1;
    }
}
