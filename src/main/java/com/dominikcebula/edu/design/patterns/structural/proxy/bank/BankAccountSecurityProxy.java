package com.dominikcebula.edu.design.patterns.structural.proxy.bank;

import com.dominikcebula.edu.design.patterns.structural.proxy.security.AuthenticationToken;
import org.javamoney.moneta.Money;

import static com.dominikcebula.edu.design.patterns.structural.proxy.security.Authority.*;

public class BankAccountSecurityProxy implements BankAccount {
    private final BankAccount bankAccount;
    private final AuthenticationToken authenticationToken;

    public BankAccountSecurityProxy(BankAccount bankAccount, AuthenticationToken authenticationToken) {
        this.bankAccount = bankAccount;
        this.authenticationToken = authenticationToken;
    }

    @Override
    public void deposit(Money amount) {
        checkIfAllowedToDeposit();
        bankAccount.deposit(amount);
    }

    @Override
    public void withdraw(Money amount) {
        checkIfAllowedToWithdraw();
        bankAccount.withdraw(amount);
    }

    @Override
    public Money getBalance() {
        checkIfAllowedGetBalance();
        return bankAccount.getBalance();
    }

    private void checkIfAllowedToDeposit() {
        if (!authenticationToken.hasAuthority(ALLOWED_DEPOSIT))
            throw new IllegalStateException("User is not allowed to deposit money using token " + authenticationToken);
    }

    private void checkIfAllowedToWithdraw() {
        if (!authenticationToken.hasAuthority(ALLOWED_WITHDRAW))
            throw new IllegalStateException("User is not allowed to withdraw money using token " + authenticationToken);
    }

    private void checkIfAllowedGetBalance() {
        if (!authenticationToken.hasAuthority(ALLOWED_GET_BALANCE))
            throw new IllegalStateException("User is not allowed to get balance using token " + authenticationToken);
    }
}
