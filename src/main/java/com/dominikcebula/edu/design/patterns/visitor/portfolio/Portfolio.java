package com.dominikcebula.edu.design.patterns.visitor.portfolio;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;
import com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private final List<FinancialInstrument> instruments = new ArrayList<>();

    public void addFinancialInstrument(FinancialInstrument instrument) {
        instruments.add(instrument);
    }

    public void removeFinancialInstrument(FinancialInstrument instrument) {
        instruments.remove(instrument);
    }

    public void accept(FinancialInstrumentVisitor visitor) {
        for (FinancialInstrument instrument : instruments) {
            instrument.accept(visitor);
        }
    }
}
