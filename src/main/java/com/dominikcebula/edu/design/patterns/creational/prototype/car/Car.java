package com.dominikcebula.edu.design.patterns.creational.prototype.car;

import org.javamoney.moneta.Money;

public class Car {
    private Color color;
    private TransmissionType transmissionType;
    private Money price;

    public Car(Color color, TransmissionType transmissionType, Money price) {
        this.color = color;
        this.transmissionType = transmissionType;
        this.price = price;
    }

    private Car(Car other) {
        this.color = other.color;
        this.transmissionType = other.transmissionType;
        this.price = other.price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", transmissionType=" + transmissionType +
                ", price=" + price +
                '}';
    }
}
