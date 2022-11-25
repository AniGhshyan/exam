package com.example.exam.example;

public class SingletonClass {

    private final static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {
    }

    public synchronized static SingletonClass get() {

        if (singletonClass == null) {
            return new SingletonClass();
        } else {
            return singletonClass;

        }
    }
}
