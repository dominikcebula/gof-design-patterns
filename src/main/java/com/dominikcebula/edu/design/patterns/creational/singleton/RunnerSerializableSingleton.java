package com.dominikcebula.edu.design.patterns.creational.singleton;

import java.io.*;

public class RunnerSerializableSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton instanceOne = SerializableSingleton.getInstance();
        byte[] instanceOneSerialized = serializeObject(instanceOne);

        SerializableSingleton instanceTwo = deserializeObject(instanceOneSerialized);

        System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode = " + instanceTwo.hashCode());
    }

    private static byte[] serializeObject(SerializableSingleton instanceOne) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutput objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);) {
            objectOutputStream.writeObject(instanceOne);
            return byteArrayOutputStream.toByteArray();
        }
    }

    private static SerializableSingleton deserializeObject(byte[] serializedObject) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedObject);
             ObjectInput objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            return (SerializableSingleton) objectInputStream.readObject();
        }
    }
}
