package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        Order o1 = new Order(101, "20-Apr-2026");
        Order o2 = new ShippedOrder(102, "21-Apr-2026", "TRK12345");
        Order o3 = new DeliveredOrder(103, "22-Apr-2026", "TRK67890", "24-Apr-2026");
        Order[] orders = {o1, o2, o3};

        for (Order o : orders) {
            o.displayInfo();
            System.out.println("Status: " + o.getOrderStatus());
            System.out.println("--------------------------");
        }
    }
}
