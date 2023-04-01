package com.dominikcebula.edu.design.patterns.visitor.calculators;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Stock;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument.DEFAULT_CURRENCY;

public class YieldCalculator implements FinancialInstrumentVisitor {
    private Money totalYield = Money.of(0, DEFAULT_CURRENCY);

    public Money getTotalYield() {
        return totalYield;
    }

    @Override
    public void visit(Stock stock) {
        totalYield = totalYield.add(stock.getPrice().multiply(stock.getShares()));
    }

    @Override
    public void visit(Bond bond) {
        totalYield = totalYield.add(bond.getFaceValue().multiply(bond.getCouponRate()));
    }
}
