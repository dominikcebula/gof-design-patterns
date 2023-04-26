package com.dominikcebula.edu.design.patterns.creational.singleton;

public class OptimizedThreadSafeSingleton {
    private static OptimizedThreadSafeSingleton instance;

    // private constructor to prevent instance creation
    private OptimizedThreadSafeSingleton() {
    }

    // double locking used to avoid locking overhead
    public static OptimizedThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (OptimizedThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new OptimizedThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}