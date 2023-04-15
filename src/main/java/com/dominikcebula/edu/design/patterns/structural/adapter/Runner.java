package com.dominikcebula.edu.design.patterns.structural.adapter;

import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.IncomeReporter;
import com.dominikcebula.edu.design.patterns.structural.adapter.income.reporter.accounting.dto.IncomeData;

public class Runner {
    public static void main(String[] args) {
        IncomeReporter incomeReporter = new IncomeReporter();
        incomeReporter.reportIncome(new IncomeData());
    }
}
