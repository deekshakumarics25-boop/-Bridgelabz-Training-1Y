package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        Author book1 = new Author(
                "The Alchemist",
                1988,
                "Paulo Coelho",
                "Brazilian author known for inspirational works"
        );

        book1.displayInfo();
    }
}
