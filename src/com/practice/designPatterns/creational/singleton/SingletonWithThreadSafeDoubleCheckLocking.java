package com.practice.designPatterns.creational.singleton;

public class SingletonWithThreadSafeDoubleCheckLocking {
    private SingletonWithThreadSafeDoubleCheckLocking INSTANCE;

    private SingletonWithThreadSafeDoubleCheckLocking() {}

    public SingletonWithThreadSafeDoubleCheckLocking getInstance() {
        if(INSTANCE == null) {
            synchronized (SingletonWithThreadSafeDoubleCheckLocking.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonWithThreadSafeDoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }
}
