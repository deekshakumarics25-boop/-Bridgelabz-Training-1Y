package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount("SA101", 50000, 4.5),
                new CheckingAccount("CA102", 30000, 10000),
                new FixedDepositAccount("FD103", 100000, 12)
        };

        for (BankAccount acc : accounts) {
            acc.displayAccountType();
            acc.displayDetails();
            System.out.println("--------------------------");
        }
    }
}
