package com.dominikcebula.edu.design.patterns.structural.proxy;

import com.dominikcebula.edu.design.patterns.structural.proxy.bank.BankAccount;
import com.dominikcebula.edu.design.patterns.structural.proxy.bank.BankAccountImpl;
import com.dominikcebula.edu.design.patterns.structural.proxy.bank.BankAccountSecurityProxy;
import com.dominikcebula.edu.design.patterns.structural.proxy.security.AuthenticationToken;
import org.javamoney.moneta.Money;

import java.util.Set;

import static com.dominikcebula.edu.design.patterns.structural.proxy.security.Authority.ALLOWED_DEPOSIT;
import static com.dominikcebula.edu.design.patterns.structural.proxy.security.Authority.ALLOWED_GET_BALANCE;

public class Runner {
    public static void main(String[] args) {
        AuthenticationToken authenticationToken = new AuthenticationToken("john", Set.of(ALLOWED_DEPOSIT, ALLOWED_GET_BALANCE));

        BankAccount bankAccount = new BankAccountSecurityProxy(
                new BankAccountImpl(),
                authenticationToken
        );

        System.out.println("Depositing money...");
        bankAccount.deposit(Money.of(500, "USD"));
        bankAccount.deposit(Money.of(300, "USD"));

        System.out.println("Getting current balance...");
        Money currentBalance = bankAccount.getBalance();
        System.out.println("Current balance = " + currentBalance);

        System.out.println("Withdrawing money...");
        bankAccount.withdraw(Money.of(100, "USD"));
    }
}
