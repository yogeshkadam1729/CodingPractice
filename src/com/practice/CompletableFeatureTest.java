package com.practice;

public class CompletableFeatureTest {
    public static  void main(String args[]) {
        Thread t = new Thread(()-> {
                System.out.println("test thread");
        });
        t.start();
    }
}
