package com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base;

public abstract class BaseAuthenticationHandler {
    private BaseAuthenticationHandler nextHandler;

    public abstract boolean handleAuthentication(AuthenticationData authenticationData);

    public void setNextHandler(BaseAuthenticationHandler handler) {
        this.nextHandler = handler;
    }

    protected boolean handleNext(AuthenticationData authenticationData) {
        if (nextHandler != null) {
            return nextHandler.handleAuthentication(authenticationData);
        }
        return false;
    }
}
