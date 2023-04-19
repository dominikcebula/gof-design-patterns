package com.dominikcebula.edu.design.patterns.creational.factory.method;

import com.dominikcebula.edu.design.patterns.creational.factory.method.shop.cart.Cart;
import com.dominikcebula.edu.design.patterns.creational.factory.method.shop.cart.DomesticCart;
import com.dominikcebula.edu.design.patterns.creational.factory.method.shop.cart.InternationalCart;
import com.dominikcebula.edu.design.patterns.creational.factory.method.shop.product.Product;
import org.javamoney.moneta.Money;

public class Runner {
    public static void main(String[] args) {
        Product product1 = new Product("Bicycle", Money.of(475, "USD"));
        Product product2 = new Product("Laptop", Money.of(800, "USD"));

        Cart cart = new DomesticCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Domestic Cart Total = " + cart.calculateTotalCost());

        cart = new InternationalCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("International Cart Cart Total = " + cart.calculateTotalCost());
    }
}
