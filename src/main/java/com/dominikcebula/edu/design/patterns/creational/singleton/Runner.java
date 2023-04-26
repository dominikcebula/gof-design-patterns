package com.dominikcebula.edu.design.patterns.creational.singleton;

public class Runner {
    public static void main(String[] args) {
        EagerlyInitializedSingleton.getInstance();
        StaticBlockSingleton.getInstance();
        LazyInitializedSingleton.getInstance();
        ThreadSafeSingleton.getInstance();
        OptimizedThreadSafeSingleton.getInstance();
        EnumSingleton.INSTANCE.someOperation();
    }
}
