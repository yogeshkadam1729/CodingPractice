package com.practice.code;

import java.util.HashMap;

public class Isomorphic205 {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap();
        int i = 0;
        int n = s.length();
        while(i < n){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a) || map.values().contains(b)) {
                if(null == map.get(a) || b != map.get(a)) {
                    return false;
                }
            }
            else {
                map.put(a,b);
            }
            i++;
        }
        return true;
    }
}
