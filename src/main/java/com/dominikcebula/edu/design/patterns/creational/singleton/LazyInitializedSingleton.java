package com.dominikcebula.edu.design.patterns.creational.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    // private constructor to prevent instance creation
    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
