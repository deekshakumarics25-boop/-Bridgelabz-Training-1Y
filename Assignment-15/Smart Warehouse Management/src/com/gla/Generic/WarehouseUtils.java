package com.gla.Generic;

import java.util.List;

public class WarehouseUtils {
    public static void displayItems(List<? extends WareHouseItem> items) {
        for (WareHouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

