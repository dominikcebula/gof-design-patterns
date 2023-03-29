package com.dominikcebula.edu.design.patterns.strategy.shipping;

import org.javamoney.moneta.Money;

public class InternationalShippingStrategy implements ShippingStrategy {
    private static final double RATE = 0.1;

    public Money calculate(Money total) {
        return total.add(total.multiply(RATE));
    }
}
