package com.dominikcebula.edu.design.patterns.behavioral.iterator.product.inventory;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
