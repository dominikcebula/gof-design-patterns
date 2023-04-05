package com.dominikcebula.edu.design.patterns.iterator.product.inventory;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
