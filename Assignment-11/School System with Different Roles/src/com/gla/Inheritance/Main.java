package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Teacher("Amit", 35, "Mathematics"),
                new Student("Riya", 20, "B.Tech"),
                new Staff("Rahul", 40, "Administration")
        };

        for (Person p : people) {
            p.displayRole();
            p.displayDetails();
            System.out.println("--------------------------");
        }
    }

}
