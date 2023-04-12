package com.dominikcebula.edu.design.patterns.structural.facade;

import com.dominikcebula.edu.design.patterns.structural.facade.order.management.OrderFacade;
import com.dominikcebula.edu.design.patterns.structural.facade.order.management.dto.Item;

public class Runner {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        var orderResult = orderFacade.placeOrder(new Item(5), 10);

        System.out.println("Order Processing Result = " + orderResult);
    }
}
