package org.alexey.creational.factory;

public class BankAccountFactory {

    public BankAccount createAccount(BankAccountType type) {
        if (type != null) {
            switch (type) {
                case PERSONAL:
                    return new PersonalAccount();
                case BUSINESS:
                    return new BusinessAccount();
                case CHECKING:
                    return new CheckingAccount();
            }
        }
        return null;
    }
}
