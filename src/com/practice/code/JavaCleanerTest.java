package com.practice.code;

import java.lang.ref.Cleaner;

public class JavaCleanerTest {

    private static final Cleaner cleaner = Cleaner.create();
    static class Resource implements Runnable {
        @Override
        public void run() {
            System.out.println("Cleaning up resources...");
        }
    }
    public static void main(String args[]) {
        Cleaner.Cleanable cleanable = cleaner.register(new Object(), new Resource());
        System.gc();
    }
}
