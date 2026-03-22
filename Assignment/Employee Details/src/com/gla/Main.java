package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Enter salary:");
        double salary= sc.nextDouble();

        Employee emp = new Employee(name,id,salary);
        emp.display();

    }
}
