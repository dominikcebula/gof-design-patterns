package com.dominikcebula.edu.design.patterns.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    // private constructor to prevent instance creation
    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    protected Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
