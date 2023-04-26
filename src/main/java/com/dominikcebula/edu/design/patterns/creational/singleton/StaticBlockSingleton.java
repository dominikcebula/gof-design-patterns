package com.dominikcebula.edu.design.patterns.creational.singleton;

public class StaticBlockSingleton {
    private final static StaticBlockSingleton INSTANCE;

    // static block initialization allows for exception handling
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred during singleton initialization", e);
        }
    }

    // private constructor to prevent instance creation
    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
