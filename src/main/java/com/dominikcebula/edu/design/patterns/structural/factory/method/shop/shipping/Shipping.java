package com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping;

import org.javamoney.moneta.Money;

public interface Shipping {
    Money calculateShippingCost(Money totalProductsCost);
}
