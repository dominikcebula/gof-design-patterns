package com.dominikcebula.edu.design.patterns.strategy;

import com.dominikcebula.edu.design.patterns.strategy.cart.ShoppingCart;
import com.dominikcebula.edu.design.patterns.strategy.inventory.Product;
import com.dominikcebula.edu.design.patterns.strategy.shipping.DomesticShippingStrategy;
import com.dominikcebula.edu.design.patterns.strategy.shipping.InternationalShippingStrategy;
import org.javamoney.moneta.Money;

class Runner {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new Product(Money.of(100, "USD")));
        shoppingCart.addItem(new Product(Money.of(200, "USD")));
        shoppingCart.addItem(new Product(Money.of(300, "USD")));

        shoppingCart.setShippingStrategy(new DomesticShippingStrategy());
        System.out.println("Total including domestic shipping is: " + shoppingCart.calculateTotal());

        shoppingCart.setShippingStrategy(new InternationalShippingStrategy());
        System.out.println("Total including international shipping is: " + shoppingCart.calculateTotal());
    }
}
