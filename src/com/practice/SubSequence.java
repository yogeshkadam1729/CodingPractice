package com.practice;

public class SubSequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("axc", "ahbgdc"));

	}
	
	public static boolean isSubsequence(String s, String t) {
		int lastIndex = 0;
		for(int i=0;i<s.length();i++) {
			boolean found = false;
			for(int j=lastIndex;j<t.length();j++) {
				if(s.charAt(i)==t.charAt(j)) {
					found = true;
					lastIndex = j+1;
					break;
				}
			}
			if(!found) return false;				
		}
			return true;
		}	
        
    }


