package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand:");
        String brand = sc.next();
        System.out.println("Enter model:");
        int model = sc.nextInt();
        System.out.println("Enter price:");
        double price = sc.nextDouble();

        MobilePhone m1 =new MobilePhone(brand,model,price);
        m1.display();
    }
}
