package com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter;

import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.AccountingSystem;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.AccountingSystem1;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.AccountingSystem2;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.LegacyAccountingSystemAdapter;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.dto.IncomeData;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.legacy.LegacyAccountingSystemImpl;

public class IncomeReporter {
    private final AccountingSystem accountingSystem1 = new AccountingSystem1();
    private final AccountingSystem accountingSystem2 = new AccountingSystem2();
    private final AccountingSystem accountingSystem3 = new LegacyAccountingSystemAdapter(
            new LegacyAccountingSystemImpl()
    );

    public void reportIncome(IncomeData incomeData) {
        accountingSystem1.reportIncome(incomeData);
        accountingSystem2.reportIncome(incomeData);
        accountingSystem3.reportIncome(incomeData);
    }
}
