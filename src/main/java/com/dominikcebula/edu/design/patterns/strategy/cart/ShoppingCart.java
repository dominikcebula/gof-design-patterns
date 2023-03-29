package com.dominikcebula.edu.design.patterns.strategy.cart;

import com.dominikcebula.edu.design.patterns.strategy.inventory.Product;
import com.dominikcebula.edu.design.patterns.strategy.shipping.ShippingStrategy;
import org.javamoney.moneta.Money;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final String DEFAULT_CURRENCY = "USD";

    private final List<Product> items = new ArrayList<>();
    private ShippingStrategy shippingStrategy;

    public void addItem(Product item) {
        items.add(item);
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public Money calculateTotal() {
        Money total = calculateProductsTotal();

        if (shippingStrategy != null) {
            total = shippingStrategy.calculate(total);
        }

        return total;
    }

    private Money calculateProductsTotal() {
        return items.stream()
                .map(Product::getPrice)
                .reduce(Money::add)
                .orElse(Money.of(0, DEFAULT_CURRENCY));
    }
}
