package com.dominikcebula.edu.design.patterns.behavioral.iterator.product.inventory;

import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private final List<Product> products;
    private int index;

    public ProductIterator(List<Product> products) {
        this.products = products;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < products.size();
    }

    public Product next() {
        if (hasNext()) {
            return products.get(index++);
        }
        return null;
    }
}
