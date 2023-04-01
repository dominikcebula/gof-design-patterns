package com.dominikcebula.edu.design.patterns.visitor.instruments.base;

import com.dominikcebula.edu.design.patterns.visitor.calculators.base.FinancialInstrumentVisitor;

public interface FinancialInstrument {
    String DEFAULT_CURRENCY = "USD";

    void accept(FinancialInstrumentVisitor visitor);
}
