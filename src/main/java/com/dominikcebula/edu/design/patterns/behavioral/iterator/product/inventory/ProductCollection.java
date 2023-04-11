package com.dominikcebula.edu.design.patterns.behavioral.iterator.product.inventory;

public interface ProductCollection {
    Iterator<Product> createIterator();
}
