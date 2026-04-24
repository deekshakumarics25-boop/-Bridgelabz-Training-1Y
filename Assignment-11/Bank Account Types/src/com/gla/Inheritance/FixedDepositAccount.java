package com.gla.Inheritance;

public class FixedDepositAccount extends BankAccount{
    int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tenure: " + tenure + " months");
    }
}
