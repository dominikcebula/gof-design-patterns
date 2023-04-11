package com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.base;

import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Stock;

public interface FinancialInstrumentVisitor {
    void visit(Stock stock);

    void visit(Bond bond);
}
