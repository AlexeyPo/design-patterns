package org.alexey.creational.abstract_factory.factory;

public class MobileFactoryProducer {
    public static AbstractFactory getFactory(boolean isApple) {
        if (isApple) {
            return new AppleMobileFactory();
        } else {
            return new AndroidMobileFactory();
        }
    }
}
