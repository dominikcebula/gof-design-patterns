package com.dominikcebula.edu.design.patterns.behavioral.strategy.shipping;

import org.javamoney.moneta.Money;

public class InternationalShippingStrategy implements ShippingStrategy {
    private static final double RATE = 0.1;

    @Override
    public Money calculate(Money total) {
        return total.add(total.multiply(RATE));
    }
}
