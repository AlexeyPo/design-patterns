package org.alexey.creational.abstract_factory.factory;

import org.alexey.creational.abstract_factory.model.Mobile;
import org.alexey.creational.abstract_factory.model.Lava;
import org.alexey.creational.abstract_factory.model.OnePlus;
import org.alexey.creational.abstract_factory.model.Sony;

public class AndroidMobileFactory extends AbstractFactory {

    @Override
    public Mobile getMobile(String mobileModel) {
        if (mobileModel.equalsIgnoreCase("OnePlus")) {
            return new OnePlus();
        } else if (mobileModel.equalsIgnoreCase("Sony")) {
            return new Sony();
        } else if (mobileModel.equalsIgnoreCase("Lava")) {
            return new Lava();
        }
        return null;
    }
}
