package com.dominikcebula.edu.design.patterns.strategy.shipping;

import org.javamoney.moneta.Money;

public interface ShippingStrategy {
    Money calculate(Money total);
}
