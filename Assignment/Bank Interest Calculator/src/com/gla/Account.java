package com.gla;

public class Account {
    int accountNumber;
    double balance;

    static String bankName = "State Bank Of India";

    Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    double calculateInterest(){
        return 0;
    }
}
