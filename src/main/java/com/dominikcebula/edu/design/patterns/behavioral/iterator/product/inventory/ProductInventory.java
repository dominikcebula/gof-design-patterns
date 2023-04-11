package com.dominikcebula.edu.design.patterns.behavioral.iterator.product.inventory;

import java.util.ArrayList;
import java.util.List;

public class ProductInventory implements ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
