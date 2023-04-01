package com.dominikcebula.edu.design.patterns.visitor.instruments;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument;
import org.javamoney.moneta.Money;

public class Bond implements FinancialInstrument {
    private final Money faceValue;
    private final double couponRate;
    private final int numYearsHeld;

    public Bond(Money faceValue, double couponRate, int numYearsHeld) {
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.numYearsHeld = numYearsHeld;
    }

    public Money getFaceValue() {
        return faceValue;
    }

    public double getCouponRate() {
        return couponRate;
    }

    public int getNumYearsHeld() {
        return numYearsHeld;
    }

    @Override
    public void accept(FinancialInstrumentVisitor visitor) {
        visitor.visit(this);
    }
}
