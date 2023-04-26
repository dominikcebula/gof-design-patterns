package com.dominikcebula.edu.design.patterns.creational.singleton;

import java.io.*;

public class RunnerSerializableSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String fileName = "test.dat";

        SerializableSingleton instanceOne = SerializableSingleton.getInstance();
        serializeObject(instanceOne, fileName);

        SerializableSingleton instanceTwo = deserializeObject(fileName);

        System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode = " + instanceTwo.hashCode());
    }

    private static void serializeObject(SerializableSingleton instanceOne, String fileName) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutput objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(instanceOne);
        }
    }

    private static SerializableSingleton deserializeObject(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInput objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (SerializableSingleton) objectInputStream.readObject();
        }
    }
}
