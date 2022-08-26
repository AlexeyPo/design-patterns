package org.alexey.creational.factory;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        new BankDemo().run();
    }

    private void run() {
        BankAccountFactory factory = new BankAccountFactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter\n" +
                " P for Personal account\n" +
                " B for Business account\n" +
                " C for Checking account\n" +
                "----------------------------");
        String type = sc.nextLine();

        BankAccountType accountType = "P".equalsIgnoreCase(type) ? BankAccountType.PERSONAL
                : "B".equalsIgnoreCase(type) ? BankAccountType.BUSINESS
                : "C".equalsIgnoreCase(type) ? BankAccountType.CHECKING
                : null;
        if (accountType == null) {
            System.out.println("There is no such type of account");
            return;
        }

        BankAccount bankAccount = factory.createAccount(accountType);
        bankAccount.registerAccount();
    }
}
