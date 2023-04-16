package com.dominikcebula.edu.design.patterns.structural.proxy.bank;

import org.javamoney.moneta.Money;

public class BankAccountImpl implements BankAccount {
    private Money balance = Money.of(0, "USD");

    @Override
    public void deposit(Money amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdraw(Money amount) {
        if (balance.isGreaterThanOrEqualTo(amount))
            balance = balance.subtract(amount);
        else
            throw new IllegalStateException("Unable to withdraw amount " + amount + " because amount exceeds current balance " + balance);
    }

    @Override
    public Money getBalance() {
        return balance;
    }
}
