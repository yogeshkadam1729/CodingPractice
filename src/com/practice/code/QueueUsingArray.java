package com.practice.code;

public class QueueUsingArray {
    int [] arr = null;
    int head = 0;
    int tail = 0;
    int size;
    QueueUsingArray (int capacity) {
        arr = new int[capacity];
    }

    boolean isEmpty() {
        return false;
    }

    int size() {
        return tail;
    }

    int front() {
        return arr[head];
    }

    int back() {
        return arr[tail-1];
    }

    void push(int element) {
        arr[tail] = element;
        tail = tail +1;
    }

    void pop() {
        for(int i = 1;i<=tail;i++) {
            arr[i-1] = arr[i];
        }
        tail = tail -1;
    }
}
