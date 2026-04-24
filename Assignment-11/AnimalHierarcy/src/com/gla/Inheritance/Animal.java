package com.gla.Inheritance;

public class Animal {
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
