package com.dominikcebula.edu.design.patterns.structural.facade.order.management;

import com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.Item;
import com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.OrderResult;
import com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem.InventoryManager;
import com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem.NotificationService;
import com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem.PaymentProcessor;
import com.dominikcebula.edu.design.patterns.structural.facade.order.management.subsystem.ShippingManager;

import static com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.OrderResult.*;

public class OrderFacade {
    private final InventoryManager inventoryManager = new InventoryManager();
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private final ShippingManager shippingManager = new ShippingManager();
    private final NotificationService notificationService = new NotificationService();

    public OrderResult placeOrder(Item item, int quantity) {
        boolean available = inventoryManager.checkAvailability(item, quantity);
        if (!available) {
            notificationService.onItemNotAvailable(item, quantity);
            return INVENTORY_NOT_AVAILABLE;
        }

        boolean paymentSuccessful = paymentProcessor.makePayment(item, quantity);
        if (paymentSuccessful) {
            shippingManager.shipOrder(item, quantity);
            notificationService.onOrderPlaced(item, quantity);
            return SUCCESS;
        } else {
            notificationService.onPaymentFailed(item, quantity);
            return PAYMENT_FAILED;
        }
    }
}
