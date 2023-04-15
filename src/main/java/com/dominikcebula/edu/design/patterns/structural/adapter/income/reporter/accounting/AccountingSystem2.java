package com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting;

import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.dto.IncomeData;

public class AccountingSystem2 implements AccountingSystem {
    @Override
    public void reportIncome(IncomeData incomeData) {
        // Income data reporting details in system 2
        System.out.println("Reporting income data in system 2");
    }
}
