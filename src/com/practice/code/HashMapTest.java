package com.practice.code;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapTest {
    public static void main(String args[])
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("yogesh","awerw");
        map.put("erter","rtert");
        map.put("cbkdvb","bcsdfsd");
        map.put("avndjf","qweqwe");
        List<Map.Entry<String,String>> values = new ArrayList<>();
        values.addAll(map.entrySet());
        values.sort(Map.Entry.comparingByValue());
        Map<String, String> sortedMap = new LinkedHashMap<>();
        values.stream().forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        System.out.println(sortedMap);
        Map<String, String> sortedMap1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1,LinkedHashMap::new));
        System.out.println(sortedMap1);
        Set<String> flatStringSet = sortedMap1.entrySet().stream().flatMap(e-> Stream.of(e.getKey() +" "+e.getValue())).collect(Collectors.toSet());
        System.out.println(flatStringSet);
    }
}
