package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement230 {
    public int kthSmallest(Node root, int k) {
        List<Integer> visitedList = new ArrayList<>();
        inorderRec(root,k,visitedList);
        return visitedList.get(k-1);
    }
    void inorderRec(Node root,int k,List<Integer> visitedList) {
        if(visitedList.size()==k) return;
        if (root != null) {
            inorderRec(root.left,k,visitedList);
            if(visitedList.size()<k)visitedList.add(root.val);
            inorderRec(root.right,k,visitedList);
        }
    }
}
