package com.practice.code;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree226 {

    TreeNode root;
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        if(root.left != null)  {
            root.left =  invertTree(root.left);
        }
        if(root.right != null)  {
            root.right = invertTree(root.right);
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }





    public TreeNode createTree(int tree[]) {
            if (tree.length == 0) return null;
            TreeNode root = new TreeNode(tree[0]);
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            for (int i = 1; i < tree.length; i++) {
                TreeNode node = q.peek();
                if (node.left == null) {
                    node.left = new TreeNode(tree[i]);
                    q.add(node.left);
                } else if (node.right == null) {
                    node.right = new TreeNode(tree[i]);
                    q.add(node.right);
                    q.remove();
                }
            }
            return root;

    }
}



