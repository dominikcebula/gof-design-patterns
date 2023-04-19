package com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping;

import org.javamoney.moneta.Money;

public class DomesticShipping implements Shipping {
    @Override
    public Money calculateShippingCost(Money totalProductsCost) {
        return totalProductsCost.multiply(0.2);
    }
}
