package org.alexey.creational.abstract_factory.model;

public class IPhone implements Mobile {

    @Override
    public void brandName() {
        System.out.println("The brand name is iPhone");
    }
}
