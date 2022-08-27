package org.alexey.creational.singleton;

public class SingletonMultiThreaded {

    private static volatile SingletonMultiThreaded INSTANCE;

    private SingletonMultiThreaded() {
    }

    public static SingletonMultiThreaded getInstance() {
        if (null == INSTANCE) {
            synchronized (SingletonMultiThreaded.class) {
                if (null == INSTANCE) {
                    INSTANCE = new SingletonMultiThreaded();
                }
            }
        }
        return INSTANCE;
    }
}
