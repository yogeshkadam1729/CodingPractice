package com.practice.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {
    Node root;

    public BinaryTreeImpl() {
        root = null;
    }
    public void insert(int key) {
        root = insertRec(root,key);
    }

    Node insertRec(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }
        if(key < root.key)
            root.left = insertRec(root.left,key);
        else if(key > root.key)
            root.right = insertRec(root.right,key);

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root,key);
    }

    Node deleteRec(Node root, int key) {
        if(root == null) return root;

        if(key < root.key)
            root.left = deleteRec(root.left,key);
        else if(key > root.key)
            root.right = deleteRec(root.right,key);
        else {
            if(root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);

        }

        return root;

    }
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    // Inorder traversal
    void inorder() {
        inorderRec(root);
        System.out.println("\n");
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void preOrder() {
        preOrderRec(root);
        System.out.println("\n");
    }

    void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    boolean search(int key) {
        return searchRec(root,key);
    }

    boolean searchRec(Node root,int key) {
        if(root == null) return false;
        if(root.key == key) return true;
        if(key < root.key) return searchRec(root.left,key);
        return searchRec(root.right,key);
    }

    int getLevelOfKey(int key)
    {
        return getLevelOfKeyRec(root,key,1);
    }
    int getLevelOfKeyRec(Node root,int key,int level) {
        if(root == null) return 0;
        if(root.key == key) return level;
        if(key < root.key) return getLevelOfKeyRec(root.left,key,level+1);
        if(key > root.key) return getLevelOfKeyRec(root.right,key,level+1);
        return 0;
    }

     void BFSAlgorithm() {
        Queue<Node> unvisited = new LinkedList<>();
        ArrayList<Integer> visitedList = new ArrayList<>();
        unvisited.add(root);
        visitedList.add(root.key);
        while(!unvisited.isEmpty()) {

            Node node = unvisited.poll();
            if(node.left != null && !visitedList.contains(node.left.key)) {
                unvisited.add(node.left);
                visitedList.add(node.left.key);
            }
            if(node.right != null && !visitedList.contains(node.right.key)) {
                unvisited.add(node.right);
                visitedList.add(node.right.key);
            }

        }
        System.out.println(visitedList);
    }
    public static void main(String args[]) {
        BinaryTreeImpl tree = new BinaryTreeImpl();

        // Inserting elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.BFSAlgorithm();
        //System.out.println("Inorder traversal:");
        //tree.inorder();

        // Deleting elements
        tree.delete(50);

        //System.out.println("Inorder traversal after deletion:");
        //tree.inorder();

        //System.out.println("is Element Present in Tree "+tree.search(20));

        //System.out.println("level of the element on tree : "+tree.getLevelOfKey(45));

    }
}

class Node
{
    int key;
    Node left;
    Node right;
    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}
