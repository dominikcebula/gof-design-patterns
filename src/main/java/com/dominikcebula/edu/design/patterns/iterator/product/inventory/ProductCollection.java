package com.dominikcebula.edu.design.patterns.iterator.product.inventory;

public interface ProductCollection {
    Iterator<Product> createIterator();
}
