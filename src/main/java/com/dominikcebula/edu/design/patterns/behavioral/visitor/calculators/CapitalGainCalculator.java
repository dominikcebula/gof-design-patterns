package com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators;

import com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Stock;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.base.FinancialInstrument.DEFAULT_CURRENCY;

public class CapitalGainCalculator implements FinancialInstrumentVisitor {
    private final Money totalCapitalGain = Money.of(0, DEFAULT_CURRENCY);

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
