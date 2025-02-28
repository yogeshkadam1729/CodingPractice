package com.practice.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LetterCombination17 {
    private static final HashMap<Character,String> phoneMap = new HashMap<>();
    static {
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");
    }
    public List<String> letterCombinationsBruteForce(String digits) {

        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        combinations.add("");
        for (char digit : digits.toCharArray()) {
            String letters = phoneMap.get(digit);
            if (letters == null) continue;
            List<String> newCombinations = new ArrayList<>();
            for (String combination : combinations) {
                for (char letter : letters.toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }
            combinations = newCombinations;
        }
        return combinations;
    }
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(index));
        if (letters == null) return;  // Skip invalid digits

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1); // Undo last append (Backtrack)
        }
    }
}
