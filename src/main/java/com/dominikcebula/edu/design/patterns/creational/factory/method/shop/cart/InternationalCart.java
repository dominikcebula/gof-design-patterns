package com.dominikcebula.edu.design.patterns.creational.factory.method.shop.cart;

import com.dominikcebula.edu.design.patterns.creational.factory.method.shop.shipping.InternationalShipping;
import com.dominikcebula.edu.design.patterns.creational.factory.method.shop.shipping.Shipping;

public class InternationalCart extends Cart {
    @Override
    Shipping createShippingMethod() {
        return new InternationalShipping();
    }
}
