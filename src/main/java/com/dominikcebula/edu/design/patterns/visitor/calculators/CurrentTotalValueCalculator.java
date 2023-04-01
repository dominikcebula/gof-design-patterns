package com.dominikcebula.edu.design.patterns.visitor.calculators;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Stock;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument.DEFAULT_CURRENCY;

public class CurrentTotalValueCalculator implements FinancialInstrumentVisitor {
    private Money currentTotalValue = Money.of(0, DEFAULT_CURRENCY);

    public Money getCurrentTotalValue() {
        return currentTotalValue;
    }

    @Override
    public void visit(Stock stock) {
        Money stockCurrentTotalValue = stock.getPrice().multiply(stock.getShares());

        currentTotalValue = currentTotalValue.add(stockCurrentTotalValue);
    }

    @Override
    public void visit(Bond bond) {
        Money bondCurrentFaceValue = bond.getFaceValue();
        Money bondCurrentCouponValue = bondCurrentFaceValue.multiply(bond.getCouponRate()).multiply(bond.getNumYearsHeld());
        Money bondCurrentTotalValue = bondCurrentFaceValue.add(bondCurrentCouponValue);

        currentTotalValue = currentTotalValue.add(bondCurrentTotalValue);
    }
}
