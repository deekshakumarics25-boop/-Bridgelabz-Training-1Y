package com.gla;

public class CartItem {
    String itemName;
    int quantity;
    int price;

    void Add(String name,int a,int b){
        itemName=name;
        quantity=a;
        price=b;
        System.out.println("Items added to the cart.");
    }
    void Remove(){
        itemName="";
        quantity=0;
        price=0;
        System.out.println("Items removed from the cart.");
    }
    void Display(){
        double total = price*quantity;
        System.out.println("Item:"+itemName);
        System.out.println("Total cost:"+total);
    }
}
