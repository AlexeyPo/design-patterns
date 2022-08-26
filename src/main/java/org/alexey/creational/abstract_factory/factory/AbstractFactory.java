package org.alexey.creational.abstract_factory.factory;

import org.alexey.creational.abstract_factory.model.Mobile;

public abstract class AbstractFactory {
    public abstract Mobile getMobile(String mobileModel);
}
