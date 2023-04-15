package com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting;

import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.dto.IncomeData;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.legacy.LegacyAccountingSystem;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.legacy.dto.LegacyIncomeData;

public class LegacyAccountingSystemAdapter implements AccountingSystem {
    private final LegacyAccountingSystem legacyAccountingSystem;

    public LegacyAccountingSystemAdapter(LegacyAccountingSystem legacyAccountingSystem) {
        this.legacyAccountingSystem = legacyAccountingSystem;
    }

    @Override
    public void reportIncome(IncomeData incomeData) {
        // Adapter that can map regular AccountingSystem request to LegacyAccountingSystem request
        System.out.println("Reporting income data in a legacy system using adapter");
        legacyAccountingSystem.reportLegacyIncome(mapToLegacyIncomeData(incomeData));
    }

    private LegacyIncomeData mapToLegacyIncomeData(IncomeData incomeData) {
        // implementation of data mapping between income data and legacy income data
        System.out.println("Mapping income data to legacy income data");
        return new LegacyIncomeData();
    }
}
