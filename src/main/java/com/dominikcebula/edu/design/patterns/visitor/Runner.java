package com.dominikcebula.edu.design.patterns.visitor;

import com.dominikcebula.edu.design.patterns.visitor.calculators.CapitalGainCalculator;
import com.dominikcebula.edu.design.patterns.visitor.calculators.YieldCalculator;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Bond;
import com.dominikcebula.edu.design.patterns.visitor.instruments.Stock;
import com.dominikcebula.edu.design.patterns.visitor.portfolio.Portfolio;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.visitor.instruments.base.FinancialInstrument.DEFAULT_CURRENCY;

public class Runner {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        portfolio.addFinancialInstrument(new Stock(Money.of(12.5, DEFAULT_CURRENCY), 100));
        portfolio.addFinancialInstrument(new Bond(Money.of(1000, DEFAULT_CURRENCY), 0.05));

        YieldCalculator yieldCalculator = new YieldCalculator();
        portfolio.accept(yieldCalculator);
        Money totalYield = yieldCalculator.getTotalYield();
        System.out.println("Total Yield = " + totalYield);

        CapitalGainCalculator capitalGainCalculator = new CapitalGainCalculator();
        portfolio.accept(capitalGainCalculator);
        Money totalCapitalGain = capitalGainCalculator.getTotalCapitalGain();
        System.out.println("Total Capital Gain = " + totalCapitalGain);
    }
}
