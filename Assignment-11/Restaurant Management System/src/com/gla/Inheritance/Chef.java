package com.gla.Inheritance;

public class Chef extends Person implements Worker{
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Cooking food, preparing menu.");
    }
}
