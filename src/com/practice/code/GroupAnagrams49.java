package com.practice.code;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap<>();
        for(String s: strs) {
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(!result.containsKey(sortedString))
                result.put(sortedString,new ArrayList<>(Arrays.asList(s)));
            else
                result.get(sortedString).add(s);
        }
        return result.values().stream().toList();
    }


}
