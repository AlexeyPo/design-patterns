package org.alexey.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1.hashCode() + " " + singleton2.hashCode() + " " + singleton3.hashCode());

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        thread1.run();
        thread2.run();
        thread3.run();
    }
}
