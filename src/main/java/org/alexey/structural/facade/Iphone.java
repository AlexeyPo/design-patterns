package org.alexey.structural.facade;

public class Iphone implements MobileShop {

    @Override
    public void getMobileModelNumber() {
        System.out.println("The model is: IPhone 13");
    }

    @Override
    public void getMobilePrice() {
        System.out.println("The price is: $1500 \n");
    }
}
