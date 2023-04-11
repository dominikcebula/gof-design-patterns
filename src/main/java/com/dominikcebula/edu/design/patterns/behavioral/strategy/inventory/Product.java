package com.dominikcebula.edu.design.patterns.behavioral.strategy.inventory;

import org.javamoney.moneta.Money;

public class Product {
    private final Money price;

    public Product(Money price) {
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }
}
