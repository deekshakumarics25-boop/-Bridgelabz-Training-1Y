package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        Person[] staff = {
                new Chef("Amit", 101),
                new Waiter("Riya", 102)
        };

        for (Person p : staff) {
            p.displayDetails();

            Worker w = (Worker) p;
            w.performDuties();

            System.out.println("--------------------------");
        }
    }
}
