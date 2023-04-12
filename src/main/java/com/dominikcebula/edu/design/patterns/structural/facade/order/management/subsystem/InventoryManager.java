package com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem;

import com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.Item;

public class InventoryManager {
    public boolean checkAvailability(Item item, int quantity) {
        // Check if item is available
        System.out.println("Checking availability for item = " + item + ", and quantity = " + quantity);
        return true;
    }
}
