package org.alexey.creational.abstract_factory.factory;


import org.alexey.creational.abstract_factory.model.Mobile;
import org.alexey.creational.abstract_factory.model.IPhone;

public class AppleMobileFactory extends AbstractFactory {

    @Override
    public Mobile getMobile(String mobileModel) {
        if (mobileModel.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }
}
