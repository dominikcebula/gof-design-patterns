package com.dominikcebula.edu.design.patterns.creational.prototype;

import com.dominikcebula.edu.design.patterns.creational.prototype.car.Car;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.creational.prototype.car.Color.BLUE;
import static com.dominikcebula.edu.design.patterns.creational.prototype.car.Color.RED;
import static com.dominikcebula.edu.design.patterns.creational.prototype.car.TransmissionType.AUTOMATIC;

public class Runner {
    public static void main(String[] args) {
        Car redCarWithAutomaticTransmission = new Car(RED, AUTOMATIC, Money.of(32000, "USD"));
        System.out.println(redCarWithAutomaticTransmission);

        Car blueCarWithAutomaticTransmission = redCarWithAutomaticTransmission.clone();
        blueCarWithAutomaticTransmission.setColor(BLUE);
        System.out.println(blueCarWithAutomaticTransmission);
    }
}
