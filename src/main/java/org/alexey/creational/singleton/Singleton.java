package org.alexey.creational.singleton;

public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        public static Singleton instance = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
