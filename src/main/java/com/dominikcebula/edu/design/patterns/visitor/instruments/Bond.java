package com.dominikcebula.edu.design.patterns.visitor.instruments;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument;
import org.javamoney.moneta.Money;

public class Bond implements FinancialInstrument {
    private Money faceValue;
    private double couponRate;

    public Bond(Money faceValue, double couponRate) {
        this.faceValue = faceValue;
        this.couponRate = couponRate;
    }

    public Money getFaceValue() {
        return faceValue;
    }

    public double getCouponRate() {
        return couponRate;
    }

    @Override
    public void accept(FinancialInstrumentVisitor visitor) {
        visitor.visit(this);
    }
}
