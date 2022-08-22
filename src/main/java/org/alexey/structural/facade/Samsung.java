package org.alexey.structural.facade;

public class Samsung implements MobileShop {

    @Override
    public void getMobileModelNumber() {
        System.out.println("The model is: Galaxy 11");
    }

    @Override
    public void getMobilePrice() {
        System.out.println("The price is: $850 \n");
    }
}
