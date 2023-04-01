package com.dominikcebula.edu.design.patterns.visitor.calculators;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Stock;
import org.javamoney.moneta.Money;

public class CapitalGainCalculator implements FinancialInstrumentVisitor {
    private Money totalCapitalGain;

    public Money getTotalCapitalGain() {
        return totalCapitalGain;
    }

    @Override
    public void visit(Stock stock) {
        // calculate capital gain for stocks
    }

    @Override
    public void visit(Bond bond) {
        // calculate capital gain for bonds
    }
}
