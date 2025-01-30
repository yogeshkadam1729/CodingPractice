package com.practice.code;

import java.util.*;

public class CloneGraph133 {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Integer,Node> visitedMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        Node node1 = new Node(node.val);
        queue.add(node);
        visitedMap.put(node1.val,node1);
        while(!queue.isEmpty()) {
            Node oldNode = queue.poll();
            Node newNode = visitedMap.get(oldNode.val);
            List<Node> neighbours = oldNode.neighbors;
            for(Node nei : neighbours) {
                Node newNei = null;
                if(visitedMap.containsKey(nei.val)) {
                    newNei = visitedMap.get(nei.val);
                }
                else {
                    newNei = new Node(nei.val);
                    visitedMap.put(newNei.val,newNei);
                    queue.add(nei);
                }
                newNode.neighbors.add(newNei);
            }
        }

        return node1;
    }
}


