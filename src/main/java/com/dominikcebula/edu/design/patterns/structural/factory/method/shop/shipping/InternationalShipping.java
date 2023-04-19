package com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping;

import org.javamoney.moneta.Money;

public class InternationalShipping implements Shipping {
    @Override
    public Money calculateShippingCost(Money totalProductsCost) {
        return totalProductsCost.multiply(0.4);
    }
}
