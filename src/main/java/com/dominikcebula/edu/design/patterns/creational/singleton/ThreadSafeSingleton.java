package com.dominikcebula.edu.design.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    // private constructor to prevent instance creation
    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
