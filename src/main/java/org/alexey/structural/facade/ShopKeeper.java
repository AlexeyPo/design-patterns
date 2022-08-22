package org.alexey.structural.facade;

public class ShopKeeper {

    private final Iphone iphone;
    private final Samsung samsung;
    private final Nokia nokia;

    public ShopKeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
        nokia = new Nokia();
    }

    public void iphoneSale() {
        iphone.getMobileModelNumber();
        iphone.getMobilePrice();
    }

    public void samsungSale() {
        samsung.getMobileModelNumber();
        samsung.getMobilePrice();
    }

    public void nokiaSale() {
        nokia.getMobileModelNumber();
        nokia.getMobilePrice();
    }
}
