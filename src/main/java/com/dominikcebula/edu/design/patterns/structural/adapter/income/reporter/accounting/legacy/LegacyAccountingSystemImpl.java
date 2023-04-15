package com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.legacy;

import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.legacy.dto.LegacyIncomeData;

public class LegacyAccountingSystemImpl implements LegacyAccountingSystem {
    @Override
    public void reportLegacyIncome(LegacyIncomeData legacyIncomeData) {
        // Income data reporting details in a legacy system
        System.out.println("Reporting income data in a legacy system");
    }
}
