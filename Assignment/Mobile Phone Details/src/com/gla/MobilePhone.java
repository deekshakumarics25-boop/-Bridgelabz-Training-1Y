package com.gla;

public class MobilePhone {
    String brand;
    int model;
    double price;

    MobilePhone(String brand, int model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Mobile phone brand:" + brand);
        System.out.println("Mobile phone model:" + model);
        System.out.println("Mobile phone price:" + price);
    }
}
