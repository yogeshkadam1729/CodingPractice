package com.practice.code;

import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int x) {
        mainStack.push(x);
        // Push the current minimum onto minStack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop operation
    public void pop() {
        // If the popped element is the current minimum, pop it from minStack as well
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        mainStack.pop();
    }

    // Top operation
    public int top() {
        return mainStack.peek();
    }

    // Get minimum operation
    public int getMin() {
        return minStack.peek();
    }
}
