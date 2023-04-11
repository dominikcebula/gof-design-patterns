package com.dominikcebula.edu.design.patterns.behavioral.visitor;

import com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.CapitalGainCalculator;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.CurrentTotalValueCalculator;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.calculators.YieldCalculator;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.Stock;
import com.dominikcebula.edu.design.patterns.behavioral.visitor.portfolio.Portfolio;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.behavioral.visitor.instruments.base.FinancialInstrument.DEFAULT_CURRENCY;

class Runner {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        portfolio.addFinancialInstrument(new Stock(Money.of(12.5, DEFAULT_CURRENCY), 100));
        portfolio.addFinancialInstrument(new Bond(Money.of(1000, DEFAULT_CURRENCY), 0.05, 5));

        CurrentTotalValueCalculator currentTotalValueCalculator = new CurrentTotalValueCalculator();
        portfolio.accept(currentTotalValueCalculator);
        Money currentTotalValue = currentTotalValueCalculator.getCurrentTotalValue();
        System.out.println("Current Total Value = " + currentTotalValue);

        YieldCalculator yieldCalculator = new YieldCalculator();
        portfolio.accept(yieldCalculator);
        double totalYield = yieldCalculator.getTotalYield();

        CapitalGainCalculator capitalGainCalculator = new CapitalGainCalculator();
        portfolio.accept(capitalGainCalculator);
        Money totalCapitalGain = capitalGainCalculator.getTotalCapitalGain();
    }
}
