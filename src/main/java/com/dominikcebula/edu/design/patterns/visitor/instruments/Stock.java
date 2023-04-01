package com.dominikcebula.edu.design.patterns.visitor.instruments;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument;
import org.javamoney.moneta.Money;

public class Stock implements FinancialInstrument {
    private Money price;
    private int shares;

    public Stock(Money price, int shares) {
        this.price = price;
        this.shares = shares;
    }

    public Money getPrice() {
        return price;
    }

    public int getShares() {
        return shares;
    }

    @Override
    public void accept(FinancialInstrumentVisitor visitor) {
        visitor.visit(this);
    }
}