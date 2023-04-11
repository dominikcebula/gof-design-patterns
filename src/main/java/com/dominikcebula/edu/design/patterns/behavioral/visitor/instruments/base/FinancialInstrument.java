package com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.base;

import com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.base.FinancialInstrumentVisitor;

public interface FinancialInstrument {
    String DEFAULT_CURRENCY = "USD";

    void accept(FinancialInstrumentVisitor visitor);
}
