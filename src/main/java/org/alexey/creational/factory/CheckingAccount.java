package org.alexey.creational.factory;

public class CheckingAccount implements BankAccount {

    @Override
    public void registerAccount() {
        System.out.println("Creating a checking account");
    }
}
