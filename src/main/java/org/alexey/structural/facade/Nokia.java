package org.alexey.structural.facade;

public class Nokia implements MobileShop {

    @Override
    public void getMobileModelNumber() {
        System.out.println("The model is: Nokia 1100");
    }

    @Override
    public void getMobilePrice() {
        System.out.println("The price is: $25 \n");
    }
}
