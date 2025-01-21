package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public class RightViewOfTree199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
       /*rightView.add(0,root.val);
       rightSideView(root,1,rightView);*/
        rightSideView(root,0,rightView);
        return rightView;
    }


   /*public void rightSideView(TreeNode root,int level,List<Integer> rightView) {
       if(root.left != null) {
           if(rightView.size() > level)
               rightView.set(level,root.left.val);
           else
               rightView.add(level,root.left.val);


           rightSideView(root.left,level+1,rightView);
       }
       if(root.right != null) {
           if(rightView.size() > level)
               rightView.set(level,root.right.val);
           else
               rightView.add(level,root.right.val);


           rightSideView(root.right,level+1,rightView);


       }


   }*/


    public void rightSideView(TreeNode root,int level,List<Integer> rightView) {
        if(root == null) return;
        if(rightView.size() == level)
            rightView.add(root.val);


        rightSideView(root.right,level+1,rightView);
        rightSideView(root.left,level+1,rightView);




    }

}

