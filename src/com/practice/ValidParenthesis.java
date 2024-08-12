package com.practice;

import java.util.Stack;

public class ValidParenthesis {

    public static  boolean isValidParenthisis(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);
            if(c == '}' || c == ']' || c == ')')
            {
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if(ch == '{' && c != '}') return false;
                if(ch == '[' && c != ']') return false;
                if(ch == '(' && c != ')') return false;
            }
        }
        return stack.isEmpty();
    }
}

