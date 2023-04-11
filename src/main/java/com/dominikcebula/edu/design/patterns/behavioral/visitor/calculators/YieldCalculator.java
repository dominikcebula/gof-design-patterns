package com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators;

import com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Stock;

public class YieldCalculator implements FinancialInstrumentVisitor {
    private double totalYield;

    public double getTotalYield() {
        return totalYield;
    }

    @Override
    public void visit(Stock stock) {
        // calculate yield for stocks
    }

    @Override
    public void visit(Bond bond) {
        // calculate yield for bond
    }
}
