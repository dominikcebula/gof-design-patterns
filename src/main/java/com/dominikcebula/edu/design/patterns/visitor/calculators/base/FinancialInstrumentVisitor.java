package com.dominikcebula.edu.design.patterns.visitor.calculators.base;

import com.dominikcebula.edu.design.patterns.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Stock;

public interface FinancialInstrumentVisitor {
    void visit(Stock stock);

    void visit(Bond bond);
}
