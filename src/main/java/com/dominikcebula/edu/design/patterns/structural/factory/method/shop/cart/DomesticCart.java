package com.dominikcebula.edu.design.patterns.structural.factory.method.shop.cart;

import com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping.DomesticShipping;
import com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping.Shipping;

public class DomesticCart extends Cart {
    @Override
    Shipping createShippingMethod() {
        return new DomesticShipping();
    }
}
