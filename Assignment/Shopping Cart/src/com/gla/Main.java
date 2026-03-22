package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of item:");
        String name= sc.nextLine();
        System.out.println("Enter price of item:");
        int price= sc.nextInt();
        System.out.println("Enter quantity of item:");
        int quantity= sc.nextInt();

        CartItem c1 = new CartItem();
        c1.Add(name,price,quantity);
        c1.Display();
        c1.Remove();
    }
}
