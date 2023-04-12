package com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem;

import com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.Item;

public class PaymentProcessor {
    public boolean makePayment(Item item, int quantity) {
        // Process payment for the item
        System.out.println("Processing payment for item = " + item + ", and quantity = " + quantity);
        return true;
    }
}
