package com.gla;

public class Items {
    int itemCode;
    String itemName;
    double price;

    Items(int itemCode,String itemName,double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    void calculate(int quantity){
        double total = price*quantity;
        System.out.println("Total Price:"+total);
    }
}
