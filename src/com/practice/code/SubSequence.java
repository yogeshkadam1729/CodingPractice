package com.practice.code;

public class SubSequence {

	public static void main(String[] args) {
		System.out.println(isSubsequenceOptimal("abc", "ahbgdc"));

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

	public static boolean isSubsequenceOptimal(String s, String t) {
		int index = 0;
		for(int i =0; i<s.length();i++)
		{
			int charPresent = t.indexOf(s.charAt(i),index);
			if(charPresent == -1) return false;
			index = charPresent+1;
		}
		return true;
	}


}


