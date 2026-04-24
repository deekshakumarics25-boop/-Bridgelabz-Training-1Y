package com.gla.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal a2 = new Dog("Bruno",5);
        Animal a3 = new Cat("Disha",3);
        Animal a4 = new Bird("Tweety",2);
        a2.makeSound();
        a3.makeSound();
        a4.makeSound();
    }
}
