package org.alexey.creational.factory;

public class BusinessAccount implements BankAccount {

    @Override
    public void registerAccount() {
        System.out.println("Creating a business account");
    }
}
