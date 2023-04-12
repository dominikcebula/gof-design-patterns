package com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem;

import com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.Item;

public class ShippingManager {
    public void shipOrder(Item item, int quantity) {
        // Ship the item
        System.out.println("Shipping item = " + item + ", with quantity = " + quantity);
    }
}
