package com.dominikcebula.edu.design.patterns.iterator;

import com.dominikcebula.edu.design.patterns.iterator.product.inventory.Iterator;
import com.dominikcebula.edu.design.patterns.iterator.product.inventory.Product;
import com.dominikcebula.edu.design.patterns.iterator.product.inventory.ProductInventory;
import org.javamoney.moneta.Money;

public class Runner {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();
        inventory.addProduct(new Product("Car", Money.of(30000, "USD")));
        inventory.addProduct(new Product("Bicycle", Money.of(475, "USD")));
        inventory.addProduct(new Product("Laptop", Money.of(800, "USD")));

        Iterator<Product> iterator = inventory.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();

            System.out.println(product);
        }
    }
}
