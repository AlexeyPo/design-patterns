package org.alexey.creational.abstract_factory;

import org.alexey.creational.abstract_factory.factory.AbstractFactory;
import org.alexey.creational.abstract_factory.factory.MobileFactoryProducer;
import org.alexey.creational.abstract_factory.model.Mobile;

public class FactoryDemo {
    public static void main(String[] args) {
        new FactoryDemo().run();

    }

    private void run() {
        AbstractFactory androidFactory = MobileFactoryProducer.getFactory(false);
        Mobile onePlus = androidFactory.getMobile("OnePlus");
        onePlus.brandName();

        Mobile sony = androidFactory.getMobile("Sony");
        sony.brandName();

        Mobile lava = androidFactory.getMobile("Lava");
        lava.brandName();

        AbstractFactory appleFactory = MobileFactoryProducer.getFactory(true);
        Mobile iPhone = appleFactory.getMobile("iPhone");
        iPhone.brandName();
    }
}
