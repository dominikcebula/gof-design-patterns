package com.dominikcebula.edu.design.patterns.strategy.shipping;

import org.javamoney.moneta.Money;

public class DomesticShippingStrategy implements ShippingStrategy {
    private static final double RATE = 0.05;

    @Override
    public Money calculate(Money total) {
        return total.add(total.multiply(RATE));
    }
}
