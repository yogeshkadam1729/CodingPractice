package com.practice.code;

import java.util.HashSet;

public class LongestSubStrignLength3 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int right = 0;
        String subString = "";
        int res = 0;
        for(char c : s.toCharArray()) {
            if(subString.indexOf(c) == -1) {
                subString += c;
                right++;
            }
            else {
                res = Math.max(res,subString.length());
                while(subString.indexOf(c) != -1 && left < right) {
                    left++;
                    subString = s.substring(left,right);
                }
                subString += c;
                right++;
            }

        }

        return subString.length() < res ? res : subString.length();

    }
    public int lengthOfLongestSubstringOptimal(String s) {
        int left = 0 ;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(),max);
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }

        }
        return max;
    }
}
