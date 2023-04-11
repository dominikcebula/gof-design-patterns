package com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.token;

import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.AuthenticationData;
import com.dominikcebula.edu.design.patterns.behavioral.chain.of.responsibility.authentication.base.BaseAuthenticationHandler;

public class TokenAuthenticationHandler extends BaseAuthenticationHandler {
    @Override
    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Executing Token based authentication....");

        if (authenticationData.doesSupport(TokenAuthenticationData.class)) {
            TokenAuthenticationData tokenAuthenticationData = authenticationData.toType();

            return tokenAuthenticationData.getToken().equals("token200");
        }

        return handleNext(authenticationData);
    }
}
