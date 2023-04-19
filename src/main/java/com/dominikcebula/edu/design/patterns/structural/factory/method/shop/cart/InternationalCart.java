package com.dominikcebula.edu.design.patterns.structural.factory.method.shop.cart;

import com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping.InternationalShipping;
import com.dominikcebula.edu.design.patterns.structural.factory.method.shop.shipping.Shipping;

public class InternationalCart extends Cart {
    @Override
    Shipping createShippingMethod() {
        return new InternationalShipping();
    }
}
