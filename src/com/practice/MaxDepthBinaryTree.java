package com.practice;

import java.util.*;

public class MaxDepthBinaryTree {
    public TreeNode generateTreeNode(Object [] objects)
    {
        if (objects == null || objects.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(objects[0]+""));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;

        while (!queue.isEmpty() && index < objects.length) {
            TreeNode current = queue.poll();

            if (index < objects.length) {
                if(objects[index] != null)
                {
                    current.left = new TreeNode(Integer.parseInt(objects[index]+""));
                    queue.offer(current.left);
                }
                index++;
            }

            if (index < objects.length) {
                if(objects[index] != null)
                {
                    current.right = new TreeNode(Integer.parseInt(objects[index]+""));
                    queue.offer(current.right);
                }
                index++;
            }
        }

        return root;
    }

    //using BFS algorithm
    public List<Double> avgOnEachDepthBFS(TreeNode root) {
        if(root == null) return null;
        List<Double> output = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            double total = 0;
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                total = total+ node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            output.add(total/ size);

        }
        return output;
    }

    //using DFS recursive algorithm
    public int maxDepthDFS(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right));
    }

    public void recursiveDFS(TreeNode root,int result)
    {

    }



}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

