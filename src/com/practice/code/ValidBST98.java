package com.practice.code;

import java.util.LinkedList;
import java.util.List;

public class ValidBST98 {

    public boolean isValidBST(Node root) {

        boolean isBST = true;
        List<Integer> inOrderList = new LinkedList<>();
        inOrderTravsal(root,inOrderList);
        int prev = inOrderList.get(0);
        for(int i =1;i<inOrderList.size();i++){
            if(inOrderList.get(i) <= prev) {
                isBST = false;
                break;
            }
            prev = inOrderList.get(i);
        }
        return isBST;
    }

    private void inOrderTravsal(Node root, List<Integer> inOrderList) {
        if(root == null) return;
        inOrderTravsal(root.left,inOrderList);
        inOrderList.add(root.val);
        inOrderTravsal(root.right,inOrderList);
    }
}
