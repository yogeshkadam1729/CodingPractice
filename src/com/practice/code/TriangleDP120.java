package com.practice.code;

import java.util.List;

public class TriangleDP120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int heaight = triangle.size();
        for(int level = heaight-2;level>=0;level--) {
            for(int i=0;i<=level;i++){
                triangle.get(level).set(i,triangle.get(level).get(i)+Math.min(triangle.get(level+1).get(i),triangle.get(level+1).get(i+1)));
            }
        }
        return triangle.get(0).get(0);
    }

}
